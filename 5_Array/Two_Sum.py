## Two Sum
# Write a program to find all pairs of integers whose sum is equal to a given number

# This function does not work when we have [0,3,4] k=6 case.
# two_sum returns true, pairs return false 
def two_sum(arr,k):
    for i in arr:
        if (k-i) in arr:
            return [i,(k-i)]
    return [-1,-1]

def two_sum_2(arr,k):
    seen={}
    for i,num in enumerate(arr):
        temp=k-num
        if temp in seen:
            return [seen[temp],i]
        seen[num]=i
    return [-1,-1]


print(two_sum([0,3,4],6))
print(two_sum_2([0,3,4],6))