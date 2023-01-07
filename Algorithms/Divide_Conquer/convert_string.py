# Convert s2 string to s1 string using delete, insert or replace operations
#  find minimum count of edit operations

def findmin(s1,s2,index1,index2):
    if index1==len(s1): # Reached end of string  s1
        return len(s2)-index2 # performing delete operation on rest of characters in string s2
    if index2==len(s2): # Reached end of string s2
        return len(s1)-index1 #performing delete operation on rest of characters in string s1
    if s1[index1]==s2[index2]:
        return findmin(s1,s2,index1+1,index2+1)
    
    deleteop= 1 + findmin(s1,s2,index1,index2+1) # moving on to the next character in s2 (considering we deleted previous character in s2)
    insertop= 1 + findmin(s1,s2,index1+1,index2) # moving on to the next character in s1 (considering we inserted previous character from s1 in s2)
    replaceop= 1 + findmin(s1,s2,index1+1,index2+1) # replacing character in s2 with character in s1
    return min(deleteop,insertop,replaceop)

print(findmin("table","tbres",0,0))