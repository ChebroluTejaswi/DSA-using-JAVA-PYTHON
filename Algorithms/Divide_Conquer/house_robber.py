# given N number of houses with some amount of money
# adjacent houses cannot be stolen.
# find maximum amount that can be stolen

houses=[6,7,1,30,8,2,4]

def houseRobber(houses,index):
    if index<0 or index>=len(houses):
        return 0
    op1=houses[index]+houseRobber(houses,index+2)
    op2=houseRobber(houses,index+1)
    return max(op1,op2)

print(houseRobber(houses,0))