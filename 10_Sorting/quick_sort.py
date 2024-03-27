# divide and conquer approach. Find pivot point and make sure at every iteration elements smaller than pivot are present before pivot and 
# elements greater than pivot are present after pivot

# def partition(arr,s,e):
#     pivot=arr[e]
#     i=s
#     j=e
#     while i<j:
#         while arr[i]<=pivot and i<e:
#             i=i+1
#         while arr[j]>pivot and j>=s:
#             j=j-1
#         if i<j:
#             arr[i],arr[j]=arr[j],arr[i]
#     arr[i],arr[e]=arr[e],arr[i]
#     print(arr,i)
#     print("---------------------")
#     return i

def partition(arr,s,e):
    pivot=arr[e]
    i=s-1
    for j in range(s,e):
        if arr[j]<=pivot:
            i=i+1
            arr[i],arr[j]=arr[j],arr[i]
    arr[i+1],arr[e]=arr[e],arr[i+1]
    print(arr,i+1)
    return i+1

def quick_sort(arr,s,e):
    if s<e:
        pivot=partition(arr,s,e)
        quick_sort(arr,s,pivot-1)
        quick_sort(arr,pivot+1,e)
    return arr

print(quick_sort([9,8,5,3,2],0,4))

