## Rotate Matrix/ Image - LeetCode 48

# You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

# You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.

# DO NOT allocate another 2D matrix and do the rotation.

# Example:
# Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
# Output: [[7,4,1],[8,5,2],[9,6,3]]


def rotate_matrix(arr):

    # exchange the columns
    for i in range(0,len(arr)//2):
        arr[i],arr[len(arr)-i-1]=arr[len(arr)-i-1],arr[i]

    # transpose
    for i in range(len(arr)):
        for j in range(i+1,len(arr[0])):
            arr[i][j],arr[j][i]=arr[j][i],arr[i][j]
    
    return arr

print(rotate_matrix([[1,2,3],[4,5,6],[7,8,9]]))