# distribute elements of array into sqrt(n) buckets. sort buckets individually then merge them

import math 

arr=[5,3,4,7,2,8,6,9,1]
num_bukcets=int(math.sqrt(len(arr)))
buckets=[]

# finding max element in array
max_val=float('-inf')
for i in arr:
    if i>max_val:
        max_val=i

# creating buckets
for i in range(0,num_bukcets):
    buckets.append([])

# adding elements in appropriate buckets
for i in arr:
    val=math.ceil((i*num_bukcets)/max_val)
    buckets[val-1].append(i)

# sorting buckets individually
for i in buckets:
    i.sort()

# merging the buckets
index=0
for i in buckets:
    for j in i:
        arr[index]=j
        index=index+1
print(arr)

