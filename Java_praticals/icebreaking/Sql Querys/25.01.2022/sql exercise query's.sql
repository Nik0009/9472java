use org;
select FIRST_NAME AS Worker_name from Worker; 
select upper(FIRST_NAME) from Worker;
select distinct DEPARTMENT from Worker;
select substring(FIRST_NAME,1,3) from Worker;
select INSTR(FIRST_NAME, BINARY'a') from Worker where FIRST_NAME = 'Amitabh';