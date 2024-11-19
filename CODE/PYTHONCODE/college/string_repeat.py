'''string = input("string:")
integer = eval(input("integer:"))
# to print the chaecter
strings=string+" "
g=strings* integer
print(g)
'''

'''

a=input()
b=len(a)
print(a[b-1])
print(b)

'''
'''
print("Enter the number of days:")
days = int(input())
years = days // 365
weeks = (days % 365) // 7
days = (days % 365) % 7
print(f"{years} year(s), {weeks} week(s), and {days} day(s)")
'''
'''
days=int(input())
years=days//365
weeks=(days%365)//7
day=(days%365)%7
print(f"{years} years {weeks} weeks {days} days")
#print(years+"year" +" " +weeks+"weeks"+" "+day+"days")


'''

'''
a = input()
an = input()
if (a == "Rock" and an == "Scissors" or  a == "Scissors" and an == "Paper" or a == "Paper" and an == "Rock"):
    print("Abhinav Wins")
else:
    if (a == "Rock" and an == "Rock" or a == "Scissors" and an == "Scissors" or a == "Paper" and an == "Paper"):
        print("Tie")
    else:
        print("Anjali Wins")
'''


'''

b=int(input())
a=[ "january","february","march","April","may","jun","july","August","september","october","november","december"]
if(b>=1 and b<=12):
    print(a[b-1])
else:
    print("Invalid Month Number")

'''


'''
a=int(input())
thousand=a//1000
fivehod=(a%1000)//500
hund=((a%1000)%500)//100
fifty=(((a%1000)%500)%100)//50
twenty=((((a%1000)%500)%100)%50)//20
five=(((((a%1000)%500)%100)%50)%20)//5
one=((((((a%1000)%500)%100)%50)%20)%5)//1

print("thous:",thousand ," 500:",fivehod,"100:",hund,"50:",fifty,"20:",twenty,"5:",five,"1:",one)


'''
'''
a = int(input())
b = int(input())
even = 0
odd = 0
while (a != b):
    if (a % 2 == 0):
        even = even + 1
        a = a + 1

    else:
        odd = odd + 1
        a = a + 1
print(odd)
print(even)

'''

'''
n = int(input())
for i in range(1, n + 1):
    for j in range(1, i + 1):
        print(chr(ord('A') + j - 1),
              end=" ");

    print("");
'''

'''
def print_pattern(rows):
    for i in range(1, rows + 1):
        for j in range(1, i + 1):
            print(j, end='')
        for j in range(i - 1, 0, -1):
            print(j, end='')
        print()

rows = 4  # Number of rows in the pattern
print_pattern(rows)

'''

'''
def convert_to_snake_case(input_string):
    snake_case_string = ''
    for index, char in enumerate(input_string):
        if char.isupper() and index != 0:
            snake_case_string += '_' + char.lower()
        else:
            snake_case_string += char.lower()
    return snake_case_string

input_string = 'PythonLearning'
snake_case_string = convert_to_snake_case(input_string)
print(snake_case_string)
'''


'''
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def sum_of_non_primes(numbers):
    non_primes_sum = 0
    for num in numbers:
        if not is_prime(num):
            non_primes_sum += num
    return non_primes_sum

# Get the input from the user
num_count = int(input("Enter the number of elements: "))
numbers = []
for i in range(num_count):
    num = int(input(f"Enter number {i+1}: "))
    numbers.append(num)

result = sum_of_non_primes(numbers)
print("Sum of non-prime numbers:", result)
'''


def print_pattern(n):
    for i in range(n, 0, -1):
        print(" " * (n - i) + "* " * i)
    for i in range(2, n + 1):
        print(" " * (n - i) + "* " * i)

# Test the function
n = 4  # Number of rows
print_pattern(n)
