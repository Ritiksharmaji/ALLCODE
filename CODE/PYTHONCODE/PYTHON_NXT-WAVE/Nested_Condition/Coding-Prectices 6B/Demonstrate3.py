a = int(input())
hundread_ruppees = a // 100
rem_amount = a % 100

fifty_ruppees = rem_amount // 50
rem_amount = rem_amount % 50

ten_ruppees = rem_amount // 10
rem_amount = rem_amount % 10

one_ruppees = rem_amount
print("100:" + str(hundread_ruppees))
print("50:" + str(fifty_ruppees))
print("10:" + str(ten_ruppees))
print("1:" + str(one_ruppees))