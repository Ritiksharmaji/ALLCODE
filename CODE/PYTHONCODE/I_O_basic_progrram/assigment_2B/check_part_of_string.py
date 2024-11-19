a=input()
b=input()
digit=int(input())
#finding the length for both
a_length=len(a)
b_length=len(b)
# finding the part of a
part=a[digit:(digit+b_length)]
d=part==b
print(d)