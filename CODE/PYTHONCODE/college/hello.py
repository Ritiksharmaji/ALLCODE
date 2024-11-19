def calculate_series_sum(n):
    sum = 0.0

    for i in range(1, n+1):
        sum += 1 / i

    return sum

# Example usage:
n = int(input("Enter the value of n: "))
series_sum = calculate_series_sum(n)
print("Sum of the series is:", series_sum)
