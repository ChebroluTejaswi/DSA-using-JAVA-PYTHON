# selecting the min value from array and appending it in sorted array 

def selection_sort(arr):
    for i in range(len(arr)-1):
        min=i
        for j in range(i+1,len(arr)):
            if arr[j]<arr[min]:
                min=j
        arr[min],arr[i]=arr[i],arr[min]
    return arr



print(selection_sort([4,9,1,6,2,7]))
