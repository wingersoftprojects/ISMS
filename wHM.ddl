ALTER TABLE staff 
  alter column wagetype set default 'monthly';
ALTER TABLE room 
  alter column housekeepingstatus set default 'dirty';
ALTER TABLE service 
  alter column istaxable set default 'no';
ALTER TABLE service 
  alter column vatinclusive set default 'yes';
ALTER TABLE bill 
  alter column billclosed set default 'no';
ALTER TABLE `user` 
  alter column locked set default 'no';
ALTER TABLE classright 
  alter column userclassid set default '0';
ALTER TABLE orderservices 
  alter column orderstatus set default 'order placed';
