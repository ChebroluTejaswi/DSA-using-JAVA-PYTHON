
def lps(s1,i1,i2):
    if i1>i2:
        return 0
    if s1[i1]==s1[i2]:
        return 2+lps(s1,i1+1,i2+1)
    op1=lps(s1,i1,i2-1) # skipping last character
    op2=lps(s1,i1+1,i2) # skipping first character
    return max(op1,op2)

print(lps("elrmenmet",0,9))