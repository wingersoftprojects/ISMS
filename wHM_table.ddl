EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'Company Details such as Name, Location, Contact Addresses, Logo, Website, Email, etc', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'company';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'Department Details such as Name, Head/In-charge, etc', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'department';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'details for each room in the hotel', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'room';
ALTER TABLE service 
  ADD code varchar(100) NULL;
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'details of the service/products offered/sold by the hotel', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'service';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'category of service/product', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'servicecategory';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'unit of measurements such as bottle, crate, carton, etc', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'measureunit';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'details of each guest wether it is at reserve or checkin!', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'guest';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'reservation details for guest/group at each reservation time', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'reservation';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'enum(''accomodation'',''bar and restaurant'',''conference and workshop'',''weddings and parties'')', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'reservation', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'reservationtypeid';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'enum(''tentative pending confirmation'',''confirmed'',''cancelled'')', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'reservation', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'reservationstatus';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'details of the rooms allocated at checkin or reservation', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'roomallocation';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'enum(''reserved'',''checked in'',''checked out'',''late check out'')
THIS IS THE STATUS AT ROOM ALLOCATION, SAY U ARE ALLOCATING A ROOM AT RESERVATION OR AT CHECK-IN', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'roomallocation', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'roomallocationstatus';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'STORES IN THE HOTEL,
STOE TYPE=enum(''main store'',''point of sale''
NOT THAT storeid=1 WILL BE STRICKTLY THE MAIN STORE', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'store';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'enum(''main store'',''point of sale''

NOT THAT storeid=1 WILL BE STRICKTLY THE MAIN STORE', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'store', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'storetype';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'closed bill can only be opened by the Admin. default will be ''no''', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'bill', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'billclosed';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'Bill can either be in the name of staff of guest!', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'bill', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'billtype';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'This refers to the current status of the bill. e.g split, merged, canceled', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'bill', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'billstatus';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'This means the responsible party', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'bill', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'steward';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'stores all the payment details per sale transaction effected', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'pay';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'dispose reasons such as expiry, damaged, etc will stored in this table', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'disposereason';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'disposal of items due to say damage, expiry, etc will be managed here and they affect the current stock as well.', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'dispose';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'only the main store can dispose but  ', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'dispose', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'storeid';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'this keeps all the history of the products supplied (added to the current stock)', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'supply';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'the different payment methods such as cash, checque, etc', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'PaymentMethod';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'WILL BE THE MAIN STORE, STRICKTLY', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'issuestock', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'fromstoreid';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'This can be:
1. Ready
2. Pending
3. Picked', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'serviceallocation', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'status';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'MAPS ROOMCATEGORY - TO- SERVICE, SO THAT AT ROOM ALLOCATION,', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'roompackage';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'enum(''yes'',''no'')', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'user', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'locked';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'enum(''yes'',''no'')', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'classright', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'allowadd';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'enum(''yes'',''no'')', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'classright', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'allowedit';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'enum(''yes'',''no'')', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'classright', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'allowview';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'enum(''yes'',''no'')', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'classright', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'allowdelete';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'For updating the room house keeping status', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'housekeepingstatus';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'AM or PM', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'shift', 
  @LEVEL2TYPE = N'Column', @LEVEL2NAME = 'meridiem';
EXEC sp_updateextendedproperty 
  @NAME = N'MS_Description', @VALUE = 'Room category/type details. 
Garden, Restaurant, Conference & BoardRoom to be added in categories!', 
  @LEVEL0TYPE = N'Schema', @LEVEL0NAME = 'dbo', 
  @LEVEL1TYPE = N'Table', @LEVEL1NAME = 'roomcategory';
