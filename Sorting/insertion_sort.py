# select the first element from the unsorted array and insert it in sorted array at right position
arr=[3,9,1,8,2]

i=0

for i in range(1,len(arr)):
    temp=arr[i]
    j=i
    while j>0 and arr[j-1]>temp:
        arr[j]=arr[j-1]
        j=j-1
    arr[j]=temp
    
print(arr)