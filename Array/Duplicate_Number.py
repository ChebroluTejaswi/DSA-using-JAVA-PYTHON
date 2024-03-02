## Duplicate number

# Write a function to remove the duplicate numbers on given integer array/list.

# Example
# remove_duplicates([1, 1, 2, 2, 3, 4, 5])
# Output : [1, 2, 3, 4, 5]

def rem_dupli(arr):
    res=[]
    for i in arr:
        if i in res:
            continue
        else:
            res.append(i)
    return res

print(rem_dupli([1, 1, 2, 2, 3, 4, 5]))