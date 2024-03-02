## 2D Lists
# Given 2D list calculate the sum of diagonal elements.

# Example
# myList2D= [[1,2,3],[4,5,6],[7,8,9]] 
# diagonal_sum(myList2D) # 15]

# T.C is more (2 loops)
def diag_sum(arr):
    res=0
    for i in range(len(arr)):
        for j in range(len(arr[0])):
            if i==j:
                res=res+arr[i][j]
    return res

# T.C is less (1 loop)
def diag_sum_2(arr):
    res=0
    for i in range(len(arr)):
        res=res+arr[i][i]
    return res

print(diag_sum([[1,2,3],[4,5,6],[7,8,9]]))
print(diag_sum_2([[1,2,3],[4,5,6],[7,8,9]]))
