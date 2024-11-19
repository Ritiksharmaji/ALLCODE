SELECT * FROM sql_join.student_info_for_course;

insert into student_info_for_course values(101,1001,2021);
insert into student_info_for_course values(102,1002,2021);
insert into student_info_for_course values(103,1003,2021);
insert into student_info_for_course values(104,1004,2020);
insert into student_info_for_course values(102,1005,2019);

select * from sql_join.student_info_for_course;

/* basic qurey  for selph join*/
select t1.S_id from sql_join.student_info_for_course as t1,sql_join.student_info_for_course as t2 where t1.S_id=t2.S_id and t1.C_id<>t2.C_id;

