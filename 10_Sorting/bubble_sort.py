# swapping the adjacent elements based on their values 

def bubble_sort(arr):
    for i in range(len(arr)):
        for j in range(len(arr)-i-1):
            if arr[j]>arr[j+1]:
                arr[j+1],arr[j]=arr[j],arr[j+1]
        # print(arr)
    return arr

print(bubble_sort([5,1,0,23,4,9,2]))



