
'''
----------------------------------
digit = int(input()
dish1 = input()
dish2 = input()
condition = (dish1 == dish2)

if condition:
    print(digit)
else:
    print(digit + 3)
----------------------------------



'''

# a = 5
# c =1
# sum =0
# while c<a:
#     sum = ((sum+a)+c)
#     a = a-1
#     c = c+1
# print(sum)

#
# for i in range(2):
#     print("outer loop:"+str(i))
#     for j in range(0,3):
#         if j<=1:
#             break
#         print(" inner loop:"+str(j))


# is_ = False
# for i in range(9,15):
#     if i % 4 == 0:
#         is_ = True
#         break
# if is_:
#     print(i)
# else:
#     print(-1)

# for i in range(10):
#     if i == 4:
#         break
#     print(i)
# print("End")



#
# count = 0
# for i in range(5,6):
#     is_prime = True
#     for j in range(2,i):
#         if i % j == 0:
#             is_prime = False
#             break
#     if is_prime:
#         count =count+1
# print(count)

# i = 1
# while i<= 3:
#     break
#     print(i)
# print('hi')

# a = True
# while a:
#     for i in range(4,10):
#         if i == 7:
#             a = False
#             break
#         print(i)
# print("hi")

# count = 1
# for i in range(2,4):
#     if i == 3:
#         break
#     if count < 2:
#         print(count)

# i = 2
# while i<= 9:
#     if i % 5 == 1:
#         break
#     i = i+1
#     print(i)
# print("Done!")

# pa = "A1b2c3"
# re = ""
# for i in pa:
#     if i.isdigit():
#         continue
#     re = re + i
# print(re)

# t = "abc@2c3"
# r = ""
# for i in t:
#     if i.isdigit():
#         break
#     r = r + i
# print(r)

# for i in range(4):
#     continue
#     print(i)
# print("End")

# i = 0
# while i<3:
#     continue
#     i = i + 1
#     print(i)
# print("End")
#
# count  = 5
# count2 = 0
# i = 0
# while True:
#     count2 = count2 + 1
#     i = i + 2
#     if i > 10:
#         break
# print(count2)

# n = int(input())
# for i in range(n):
#     number = int(input())
#     if number > 0:
#         print(number)
#         continue

sentence = input()
len_input = len(sentence)
for i in range(len_input):
    if sentence[i] == " ":
        break
first_word = sentence[:i]
first_word = first_word.upper()
output = first_word + sentence[i:]
print(output)