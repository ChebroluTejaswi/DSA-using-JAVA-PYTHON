# 2D matrix is given along with cost for accessing a cell.
# we need to start from (0,0) and go till (n-1,n-1) cell.
# we can go only to right or down cell from current cell.
# find the number of ways to reach end of matrix with given "total cost"

mat=[[4,7,1,6],
     [5,7,3,9],
     [3,2,1,2],
     [7,1,6,3]]
cost=25

def num_ways(mat,r,c,cost):
    if cost<0:
        return 0
    elif r==0 and c==0:
        if mat[r][c]-cost==0:
            return 1
        return 0
    elif r==0:
        return num_ways(mat,0,c-1,cost=cost-mat[r][c])
    elif c==0:
        return num_ways(mat,r-1,0,cost-mat[r][c])
    else:
        w1=num_ways(mat,r-1,c,cost-mat[r][c])
        w2=num_ways(mat,r,c-1,cost-mat[r][c])
        return w1+w2

print(num_ways(mat,3,3,cost))