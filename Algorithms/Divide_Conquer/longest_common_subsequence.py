# find length of longest subsequence which is common to both strings
# subsequence: a sequence that can be derived from another sequence by deleting some elements 
# without changing the order of them.

def lcs(s1,s2,index1,index2):
    
    if index1>=len(s1) or index2>=len(s2):
        return 0
    if s1[index1]==s2[index2]:
        return 1+ lcs(s1,s2,index1+1,index2+1)# considering both characters
    l1= 0 + lcs(s1,s2,index1+1,index2)# skipping the character from s1
    l2= 0 + lcs(s1,s2,index1,index2+1)# skipping the character from s2
    return max(l1,l2)

print(lcs("elephant","erepat",0,0))