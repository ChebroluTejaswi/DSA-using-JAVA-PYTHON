coins=[1,2,5,10,20,50,100,1000]
total_sum=2035

d={}
end=len(coins)-1

while(total_sum!=0):
    if total_sum/coins[end]:
        d[coins[end]]=total_sum//coins[end]
        total_sum=total_sum%coins[end]
    end=end-1

print("minimum coins: ",sum(d.values()))