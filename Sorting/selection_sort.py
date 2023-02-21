# selecting the min value from array and appending it in sorted array 

arr=[1,9,3,7,4]
i=0
j=1

while i<len(arr):
    min=float('inf')
    min_ind=0
    for j in range(i+1,len(arr)):
        if arr[j]<min:
            min=arr[j]
            min_ind=j
    if arr[i]>min:
        arr[i],arr[min_ind]=arr[min_ind],arr[i]
        i=i+1
    else:
        i=i+1

print(arr)

