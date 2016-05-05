CREATE OR REPLACE VIEW view_user_action AS 
	select 'staff data' as category,'staff' as object,
	s.staff_id as object_id,s.add_user as user_id,s.add_date as date,
	DAYOFMONTH(s.add_date) as day,MONTH(s.add_date) as month,YEAR(s.add_date) as year,
	u1.username,'added' as action from staff s 
	inner join user_detail u1 on s.add_user=u1.user_detail_id 
UNION 
	select 'staff data' as category,'staff' as object,
	s.staff_id as object_id,s.edit_user as user_id,s.edit_date as date,
	DAYOFMONTH(s.edit_date) as day,MONTH(s.edit_date) as month,YEAR(s.edit_date) as year,
	u2.username,'updated' as action from staff s 
	inner join user_detail u2 on s.edit_user=u2.user_detail_id 
	UNION 
	select 'staff document' as category,dt1.doc_type_name as object,
	td1.task_document_id as object_id,td1.add_user as user_id,td1.add_date as date,
	DAYOFMONTH(td1.add_date) as day,MONTH(td1.add_date) as month,YEAR(td1.add_date) as year,
	u3.username,'added' as action from task_document td1 
	inner join user_detail u3 on td1.add_user=u3.user_detail_id 
	inner join document_type dt1 on td1.document_type_id=dt1.document_type_id 
UNION 
	select 'staff document' as category,dt2.doc_type_name as object,
	td2.task_document_id as object_id,td2.edit_user as user_id,td2.edit_date as date,
	DAYOFMONTH(td2.edit_date) as day,MONTH(td2.edit_date) as month,YEAR(td2.edit_date) as year,
	u4.username,'added' as action from task_document td2 
	inner join user_detail u4 on td2.edit_user=u4.user_detail_id 
	inner join document_type dt2 on td2.document_type_id=dt2.document_type_id; 


DROP PROCEDURE IF EXISTS sp_clean_current_staff_documents;
DELIMITER //
CREATE PROCEDURE sp_clean_current_staff_documents()
BEGIN 
	DECLARE max_staff_id INT DEFAULT 0;
	DECLARE counter INT DEFAULT 0;
	DECLARE latest_staff_document_id INT DEFAULT 0;

	SELECT max(staff_id) FROM staff INTO max_staff_id;
	SET counter=0;

	WHILE counter<max_staff_id DO
		
		SELECT c.current_staff_documents_id from current_staff_documents c 
		inner join task_document t on t.task_document_id=c.task_document_id
		inner join document_type as dt on dt.document_type_id=t.document_type_id
		where c.staff_id=counter and dt.document_type_level in (2,3) and (c.is_deleted='No' or c.is_deleted is null) 
		order by t.expiry_date DESC 
		LIMIT 1 
		into latest_staff_document_id;

		UPDATE current_staff_documents as c 
		inner join document_type as dt on dt.document_type_id=c.document_type_id 
		SET is_deleted='Yes',delete_date=NOW() 
		where staff_id=counter and current_staff_documents_id<>latest_staff_document_id and dt.document_type_level in (3);
		
		SET counter = counter + 1;
	END WHILE;
END//
DELIMITER ;