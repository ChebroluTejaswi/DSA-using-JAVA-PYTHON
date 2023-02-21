# swapping the adjacent elements based on their values 

arr=[5,9,3,1,2,8]
for i in range(0,len(arr)):
    for j in range(i+1,len(arr)):
        if arr[j]<arr[i]:
            arr[j],arr[i]=arr[i],arr[j]
        
print(arr)