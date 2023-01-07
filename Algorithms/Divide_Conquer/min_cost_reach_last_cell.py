# 2D matrix is given along with cost for accessing a cell.
# we need to start from (0,0) and go till (n-1,n-1) cell.
# we can go only to right or down cell from current cell.
# Find way in which the cost is minimum.

mat=[[4,7,8,6,4],
     [6,7,3,9,2],
     [3,8,1,2,4],
     [7,1,7,3,7],
     [2,9,8,9,3]]

def min_cost(mat,r,c):
    if r==-1 or c==-1:
        return float('inf')
    elif r==0 and c==0:
        return mat[r][c]
    down= min_cost(mat,r-1,c)
    right=min_cost(mat,r,c-1)
    return mat[r][c]+min(down,right)
    

print(min_cost(mat,4,4))