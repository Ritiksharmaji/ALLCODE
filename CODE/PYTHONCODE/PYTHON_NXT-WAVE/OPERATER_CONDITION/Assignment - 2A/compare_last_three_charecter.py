a=input()
b=input()
first_part=a[len(a)-3]
last_part=b[len(b)-3]
print(first_part)
print(last_part)

# find the index of last three charecter
first_integer=(len(a)-3)
last_integer=(len(b)-3)

# store the last three charecter in a variable
fist_last_charecter = a[first_integer:]
last_last_charecter=b[last_integer:]
# print the last three chaecter
print(fist_last_charecter)
print(last_last_charecter)

# compare those charecter
output= fist_last_charecter == last_last_charecter
print(output)