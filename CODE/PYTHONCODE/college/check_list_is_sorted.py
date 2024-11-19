def check_sort_order(lst):
    ascending = True
    descending = True

    for i in range(len(lst) - 1):
        if lst[i] > lst[i+1]:
            ascending = False
        elif lst[i] < lst[i+1]:
            descending = False

    if ascending:
        print("Items in the list are sorted in ascending order.")
    elif descending:
        print("Items in the list are sorted in descending order.")
    else:
        print("Items in the list are not sorted.")

# Example usage:
my_list = [1, 3, 5, 7, 9]
check_sort_order(my_list)
