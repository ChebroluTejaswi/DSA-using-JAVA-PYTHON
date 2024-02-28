def gcd_1(a,b):
    if b==0:
        return a
    else:
        return gcd_1(b,a%b)

def gcd_2(a,b):
    if a>b:
        return gcd_2(a-b,b)
    elif b>a:
        return gcd_2(a,b-a)
    else:
        return a
    
print(gcd_1(11,12))
print(gcd_2(194067000,194067))