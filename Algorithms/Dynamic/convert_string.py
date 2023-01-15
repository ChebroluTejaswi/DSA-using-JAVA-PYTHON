# Convert s2 string to s1 string using delete, insert or replace operations
#  find minimum count of edit operations

# TOP-DOWN
def findmin(s1,s2,index1,index2,tempDic):
    if index1==len(s1): # Reached end of string  s1
        return len(s2)-index2 # performing delete operation on rest of characters in string s2
    if index2==len(s2): # Reached end of string s2
        return len(s1)-index1 #performing delete operation on rest of characters in string s1
    if s1[index1]==s2[index2]:
        return findmin(s1,s2,index1+1,index2+1,tempDic)
    else:
        dickey= str(index1)+str(index2)
        if dickey not in tempDic:
            deleteop= 1 + findmin(s1,s2,index1,index2+1,tempDic) # moving on to the next character in s2 (considering we deleted previous character in s2)
            insertop= 1 + findmin(s1,s2,index1+1,index2,tempDic) # moving on to the next character in s1 (considering we inserted previous character from s1 in s2)
            replaceop= 1 + findmin(s1,s2,index1+1,index2+1,tempDic) # replacing character in s2 with character in s1
            tempDic[dickey] = min(deleteop,insertop,replaceop)
    return tempDic[dickey]

tempDic={}
print(findmin("table","tbres",0,0,tempDic))

# BOTTOM-UP
def findmin_bu(s1,s2,i1,i2,td):
    td=[0]*(len(s1)+1)
    for i in range(len(td)):
        td[i]=[0]*(len(s2)+1)
    
    for i1,i2 in zip(range(len(s1)-1,-1,-1),range(len(s2)-1,-1,-1)):
        if i1==0:
            td[i1][i2]=len(s2)-i2
        elif i2==0:
            td[i1][i2]=len(s1)-i1
        elif (s1[i1]==s2[i2]):
            td[i1][i2]= td[i1+1][i2+1]
        else:
            td[i1][i2]=1+min(td[i1+1][i2],td[i1][i2+1],td[i1+1][i2+1])
    # print(td)
    return td[0][0]

td=[[]]
print(findmin_bu("table","tbres",0,0,td))