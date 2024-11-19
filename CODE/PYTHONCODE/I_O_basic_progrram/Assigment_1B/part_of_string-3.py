string=input()
length=len(string)
# finding the first two charecter
first_Strings=string[:2]
lengt_first=len(first_Strings)
first_out="#" * lengt_first
print(first_out)
#finding the last two charecters
last_strings=len(string[(length-2):])
last_out="#" * last_strings
print(last_out)
middle_string=string[lengt_first:(length-2)]
print(middle_string)