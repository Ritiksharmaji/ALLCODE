a = int(input())

hundread_ruppees = a // 100
print("100$:",hundread_ruppees)
rem_amount = a % 100
print("rem_amount_of_100$:",rem_amount)

fifty_ruppees = rem_amount // 50
print("50$:",fifty_ruppees)
rem_amount = rem_amount % 50
print("rem_amount_of_50$:",rem_amount)

ten_ruppees = rem_amount // 10
print("10$:",ten_ruppees)
rem_amount = rem_amount % 10
print("rem_amount_of_10$:",rem_amount)

one_ruppees = rem_amount
print("1$:",one_ruppees)

print("100:" + str(hundread_ruppees))
print("50:" + str(fifty_ruppees))
print("10:" + str(ten_ruppees))
print("1:" + str(one_ruppees))