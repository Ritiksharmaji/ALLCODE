
#Write an R program to create a data frame that contains details of employees 
#such as name, salary, and date of birth.
#Display statistics of the data on salary and date of birth. (5 Marks)

name=c("ritik","golu","ankit","priya","ram")
salary=c(20000,30000,40000,10000,15000)
date_of_birth=c('02-02-2002','02-04-1990','05-08-1998','09-05-2004','04-04-2004')
employee=data.frame(name,salary,date_of_birth)
print(employee)
print(summary(employee))
print(summary(employee$salary))
print(summary(employee$date_of_birth))


