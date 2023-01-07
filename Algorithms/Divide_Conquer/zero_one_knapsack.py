items=[[3,31],
       [1,26],
       [2,17],
       [5,72]]
c=7

def zeroOneKnapsack(items,capacity,i):

    # Divide and Conquer approach

    if capacity <=0 or i<0 or i>=len(items):
        return 0
    elif items[i][0]<=capacity:
        p1= items[i][1]+zeroOneKnapsack(items,capacity-items[i][0],i+1) # selecting the item
        p2= zeroOneKnapsack(items,capacity,i+1) # not selecting the item
        return max(p1,p2)
    else:
        return 0


    # Greedy approach

    # items.sort(key= lambda x:x[0]/x[1])
    # val=0
    # currw=0
    # for i in range(len(items)):
    #     if (currw+items[i][0])<=capacity:
    #         val=val+items[i][1]
    #         currw=currw+items[i][0]
    #     else:
    #         return val

        


print(zeroOneKnapsack(items,c,0))