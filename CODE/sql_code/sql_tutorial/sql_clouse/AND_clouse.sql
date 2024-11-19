SELECT * FROM sql_tutorial.emplayee;

/*  this is for sql clouse 

CREATE TABLE `sql_tutorial`.`emplayee` (
  `emp_id` INT NOT NULL ,
  `emp_firstName` VARCHAR(45) NOT NULL,
  `emp_lastName` VARCHAR(45) NOT NULL,
  `department` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`emp_id`));


*/
/*  this is for AND CLOUSE

Example 1: 

Write a query to get the records from emp tables in which department of the employee is IT and location is Chennai
*/
select * from sql_tutorial.emplayee where department = 'it' and location ='chennai';


/*

Example 2:

Write a query to get the records from emp tables in which department of the employee is IT and location is Mumbai. 
*/
select * from sql_tutorial.emplayee where department = "it" AND location= "mumbai";

