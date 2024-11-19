data <- data.frame(x1 = c(NA, 5, 6, 8, 9),	
                   x2 = c(2, 4, NA, NA, 1),
                   x3 = c(3,6,7,0,3),
                   x4 = c("Hello", "value",
                          NA, "geeksforgeeks", NA))

#print(data)					

# to find out the missing value
which(is.na(data$x1))
which(is.na(data$x2))
which(is.na(data$x3))
which(is.na(data$x4))
#is.na(data)

#new frame

dat<- data.frame(x1 = c(NA, 5, 6, 8, 9),	
                   x2 = c(2, 4, NA, NA, 1),
                   x3 = c(3,6,7,0,3))


REM<- na.omit(dat)
print(REM)
x=c(1,2,55,3,12,45,70)
factor(x)
print(x)