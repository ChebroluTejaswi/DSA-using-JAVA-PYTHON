# Given n, find number of ways to express n as sum of 1,3,4

#  TOP-DOWN
def number_factor_td(n,tempdic):
    if n in (0,1,2):
        return 1
    elif n==3:
        return 2
    else:
        if n not in tempdic:
            s1=number_factor_td(n-1,tempdic)
            s2=number_factor_td(n-3,tempdic)
            s3=number_factor_td(n-4,tempdic)
            tempdic[n]=s1+s2+s3
    return tempdic[n]

tempdic={}
print(number_factor_td(6,tempdic))

# BOTTOM-UP
def number_factor_bu(n):
    td=[1,1,1,2]
    for i in range(4,n+1):
        td.append(td[i-1]+td[i-3]+td[i-4])
    return td[n]
print(number_factor_bu(6))
