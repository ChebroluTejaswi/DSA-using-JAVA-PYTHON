# Given n, find number of ways to express n as sum of 1,3,4
def numberfactor(n):
    if n in (0,1,2):
        return 1
    elif n==3:
        return 2
    else:
        sp1=numberfactor(n-1)
        sp2=numberfactor(n-3)
        sp3=numberfactor(n-4)
        return sp1+sp2+sp3

print(numberfactor(6))