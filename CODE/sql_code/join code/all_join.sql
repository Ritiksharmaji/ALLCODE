SELECT * FROM sql_join.emp_info;
insert into emp_info values(101,'go',399,'delhi');
insert into emp_info values(102,'ram',3990,'mumbai');
insert into emp_info values(103,'go',40000,'patna');
insert into emp_info values(104,'go',2000,'AP');
insert into emp_info values(105,'go',5000,'delhi');
select * from sql_join.emp_info;


select * from sql_join.dep_info;
insert into dep_info values(10,'IT',104);
insert into dep_info values(11,'CSC',103);
insert into dep_info values(12,'LLB',105);
insert into dep_info values(13,'IT',102);
SELECT * FROM  sql_join.dep_info;


select E_name from sql_join.emp_info,sql_join.dep_info where sql_join.emp_info.E_ID=sql_join.dep_info.E_ID;

/*for the natural join;  */
select  E_name from  sql_join.emp_info natural join sql_join.dep_info;


