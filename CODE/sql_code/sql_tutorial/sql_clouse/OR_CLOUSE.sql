
-- creating a table
/*
CREATE TABLE `sql_tutorial`.`emplayee1` (
  `emp_id` INT NOT NULL ,
  `emp_firstName` VARCHAR(45) NOT NULL,
  `emp_lastName` VARCHAR(45) NOT NULL,
  `department` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`emp_id`));
   
   */
   
   /*
   
   INSERT INTO `sql_tutorial`.`emplayee1` (`emp_id`, `emp_firstName`, `emp_lastName`, `department`, `location`) VALUES ('1', 'harshad', 'kuwar', 'marketing', 'pune');
INSERT INTO `sql_tutorial`.`emplayee1` (`emp_id`, `emp_firstName`, `emp_lastName`, `department`, `location`) VALUES ('2', 'anurag', 'kuwar', 'it', 'mumbai');
INSERT INTO `sql_tutorial`.`emplayee1` (`emp_id`, `emp_firstName`, `emp_lastName`, `department`, `location`) VALUES ('3', 'chaitali', 'rajput', 'it', 'chennai');
INSERT INTO `sql_tutorial`.`emplayee1` (`emp_id`, `emp_firstName`, `emp_lastName`, `department`, `location`) VALUES ('4', 'pranjal', 'tarle', 'it', 'chennai');
INSERT INTO `sql_tutorial`.`emplayee1` (`emp_id`, `emp_firstName`, `emp_lastName`, `department`, `location`) VALUES ('5', 'suraj', 'patil', 'marketing', 'bangalore');
INSERT INTO `sql_tutorial`.`emplayee1` (`emp_id`, `emp_firstName`, `emp_lastName`, `department`, `location`) VALUES ('6', 'roshani', 'jadhav', 'finance', 'bangalore');
INSERT INTO `sql_tutorial`.`emplayee1` (`emp_id`, `emp_firstName`, `emp_lastName`, `department`, `location`) VALUES ('7', 'sandhaya', 'jain', 'finance', 'bangalore');

*/

-- query will start

/*
Example 1:

Write a query to get the records from emp tables in which department of the employee is IT or location is Chennai.

*/
select * from sql_tutorial.emplayee1 where department = "it" OR location = "chennai";


/*

Example 1:

Write a query to update the records in emp tables in which department of the employee is Marketing, or the last name is jain. For that particular employee, set the updated value of the location as Delhi.

*/

UPDATE sql_tutorial.emplayee1 SET location = "Delhi" WHERE department = "marketing" OR emp_lastName = "jain";
UPDATE sql_tutorial.emplayee1  SET Location = "Delhi" WHERE emp_id >= '2' OR department = "marketing" OR emp_lastName = "jain";

  