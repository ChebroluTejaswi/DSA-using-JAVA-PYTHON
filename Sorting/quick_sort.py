# divide and conquer approach. Find pivot point and make sure at every iteration elements smaller than pivot are present before pivot and 
# elements greater than pivot are present after pivot

arr=[3,5,8,1,2,9,4]

# def partition(arr,s,e):
#     pivot=arr[s]
#     i=s
#     j=e
#     while i<j:
#         while arr[i]<=pivot and i<e:
#             i=i+1
#         while arr[j]>pivot and j>=s:
#             j=j-1
#         if i<j:
#             arr[i],arr[j]=arr[j],arr[i]
#     arr[j],arr[s]=arr[s],arr[j]
#     return j

def partition(arr,s,e):
    pivot=arr[e]
    i=s
    j=e
    while i<j:
        while arr[i]<=pivot and i<e:
            i=i+1
        while arr[j]>pivot and j>=s:
            j=j-1
        if i<j:
            arr[i],arr[j]=arr[j],arr[i]
    arr[i],arr[e]=arr[e],arr[i]
    return i

def quicksort(arr,s,e):
    if s<e:
        p=partition(arr,s,e)
        quicksort(arr,s,p-1)
        quicksort(arr,p+1,e)

quicksort(arr,0,len(arr)-1)
print(arr)