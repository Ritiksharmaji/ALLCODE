
'''
signal=input()
flag=False
for i in signal:
    if(i==i.lower() or (i=="_")):
        continue
    else:
        flag=True
        break
if(flag==False):
    print("signal in smak")
else:
    print("not snak")


'''
'''
a=input()
b=input()
j=0
length=len(b)
char=""
for i in a:
    if(i == b[j]):
        char=char+i
        j=j+1
        if(j == length):
            break
print(char)

'''
a=eval(input())
print(type(a))
# convert into string

temp_string = str(a)
print(type(temp_string))

first_chr=temp_string[0]
second_chr=temp_string[(len(temp_string)-1)]
print(first_chr)
print(second_chr)