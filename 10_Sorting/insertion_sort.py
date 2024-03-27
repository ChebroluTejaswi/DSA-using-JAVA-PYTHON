# select the first element from the unsorted array and insert it in sorted array at right position

def insertion_sort(arr):
    for i in range(1,len(arr)):
        j=i
        val=arr[i]
        while j>0 and arr[j-1]>val:
            arr[j]=arr[j-1]
            j=j-1
        arr[j]=val
    return arr


print(insertion_sort([4,9,2,1,2,32]))