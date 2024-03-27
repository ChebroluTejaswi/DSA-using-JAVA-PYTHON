# distribute elements of array into sqrt(n) buckets. sort buckets individually then merge them
import math

def bucket_sort(arr):
    bc=int(math.sqrt(len(arr)))
    ma=max(arr)

    buckets=[]
    for i in range(bc):
        buckets.append([])
    
    for i in arr:
        val=math.ceil((i*bc)/ma)
        buckets[val-1].append(i)

    res=[]
    for i in buckets:
        i.sort()
        res.extend(i)
    
    return res        

print(bucket_sort([5,3,4,7,2,8,6,9,1]))