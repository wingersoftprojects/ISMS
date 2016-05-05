alter table current_staff_documents 
  add column is_deleted varchar(3);
alter table current_staff_documents 
  add column delete_date datetime;
