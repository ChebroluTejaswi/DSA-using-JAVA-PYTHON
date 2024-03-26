def linear_search(arr,val):
    ind=-1
    for i in arr:
        if i==val:
            return "found"
    return "not found"

print(linear_search([9,8,7],8))
print(linear_search([9,8,7],3))