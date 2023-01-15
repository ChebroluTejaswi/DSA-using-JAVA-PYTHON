# Using memoization : TOP-DOWN

def fibo_memo(n,memo):
    if n==1 or n==0:
        return n 
    if n not in memo:
        memo[n]=fibo_memo(n-1,memo)+fibo_memo(n-2,memo)
    return memo[n]


myDic={}
for i in range(7):
    print(fibo_memo(i,myDic),end="\t")
print()

# ---------------------------------------------------
# Using tabulation : BOTTOM-UP

def fibo_tab(n):
    if n==1 or n==0:
        return n
    tb=[0,1]
    for i in range(2,n+1):
        tb.append(fibo_tab(n-1)+fibo_tab(n-2))
    return tb[n-1]

for i in range(7):
    print(fibo_tab(i),end="\t")

