s = input()
''''
# Check if a character is uppercase
char = 'A'
if char.isupper():
    print(f"'{char}' is an uppercase letter")

# Check if a character is lowercase
char = 'a'
if char.islower():
    print(f"'{char}' is a lowercase letter")
'''

first_char = ""
word = ""
for i in range(len(s)):

    if s[i] != " ":
        word = word+s[i]

    first_char = word
    if(first_char[0] )

print(first_char)






