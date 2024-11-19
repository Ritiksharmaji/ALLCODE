'''
try with java
'''

a = int(input())
repuess_1 = 0
repuess_10 = 0
repuess_50 = 0
repuess_100 = 0

if 1 <= a < 10:
    repuess_1 = a
elif 10 <= a < 50:
    repuess_10 = a // 10
    remainder_10 = a % 10
    if remainder_10 < 10:
        repuess_1 = remainder_10

elif 50 <= a < 100:
    repuess_50 = a // 50
    remainder_50 = a % 50
    repuess_10 = remainder_50 // 10
    remainder_10 = remainder_50 % 10
    repuess_1 = remainder_10
elif a >= 100:
    repuess_100 = a // 100
    remainder_100 = a % 100
    if remainder_100 >= 50:
        repuess_50 = remainder_100 // 50
        remainder_50 = remainder_100 % 50
        repuess_10 = remainder_50 // 10
        remainder_10 = remainder_50 % 10
        repuess_1 = remainder_10
    elif 10 <= remainder_100 < 50:
        repuess_10 = remainder_100 // 10
        remainder_10 = remainder_100 % 10
        repuess_1 = remainder_10
    else:
        repuess_1 = remainder_100
print("100:" + str(repuess_100))
print("50:" + str(repuess_50))
print("10:" + str(repuess_10))
print("1:" + str(repuess_1))



