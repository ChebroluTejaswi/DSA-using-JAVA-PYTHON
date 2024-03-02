## Middle Function
# Write a function called middle that takes a list and returns a new list that contains all but the first and last elements.

# myList = [1, 2, 3, 4]
# middle(myList)  # [2,3]

def middle_fun(arr):
    if len(arr)>3:
        return arr[1:-1]
    else:
        return [-1,-1]
    
print(middle_fun([1,2]))