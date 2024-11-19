# create vector with names 

name = c("sravan","mohan","sudheer", 
         
         "radha","vani","mohan") 


# create vector with subjects 

subjects = c(".net","Python","java", 
             
             "dbms","os","dbms") 


# create a vector with marks 

marks=c(98,97,89,90,87,90) 


# create vector with height 

height=c(5.97,6.11,5.89, 
         
         5.45,5.78,6.0) 


# create vector with weight 

weight=c(67,65,78,65,81,76) 


# pass these vectors to the data frame 

data=data.frame(name,subjects,marks, 
                
                height,weight) 


# display 

print(data) 

print("STATISTICAL SUMMARY of marks") 


# use summary function  on marks column 

print(summary(data$marks)) 

print("STATISTICAL SUMMARY of height") 




# use summary function on height column 

print(summary(data$height)) 

print("STATISTICAL SUMMARY of weight") 


# use summary function on weight column 

print(summary(data$weight))
