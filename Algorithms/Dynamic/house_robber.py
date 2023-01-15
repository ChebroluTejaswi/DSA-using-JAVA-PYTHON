# given N number of houses with some amount of money
# adjacent houses cannot be stolen.
# find maximum amount that can be stolen
houses=[6,7,1,30,8,2,4]

# TOP-DOWN
def house_robber_td(houses,index,tempDic):
    if index<0 or index>=len(houses):
        return 0
    else:
        if index not in tempDic:
            s1=houses[index]+house_robber_td(houses,index+2,tempDic)
            s2=house_robber_td(houses,index+1,tempDic)
            tempDic[index]=max(s1,s2)
        return tempDic[index]

tempDic={}
print(house_robber_td(houses,0,tempDic))

# BOTTOM-UP
def house_robber_bu(houses,td):
    td=[0]*(len(houses)+2)
    for i in range(len(houses)-1,-1,-1): # iterating from n-1 to -1 with steps (-1)
        td[i]=max(houses[i]+td[i+2],td[i+1])
    return td[0]
td=[]

print(house_robber_bu(houses,td))