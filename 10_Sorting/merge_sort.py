# divide and conquer approach: Recursively half the array till they can't be splitted further
# merge the sorted halves

def merge(arr,l,mid,r):
    left=arr[l:mid+1]
    right=arr[mid+1:r+1]

    n1=len(left)
    n2=len(right)
    k=l
    i=0
    j=0
    # print(left, right, mid,l,r)
    while i<n1 and j<n2:

        if left[i]<right[j]:
            arr[k]=left[i]
            i=i+1
        else:
            arr[k]=right[j]
            j=j+1
        k=k+1

    while i<n1:
        arr[k]=left[i]
        i=i+1
        k=k+1

    while j<n2:
        arr[k]=right[j]
        j=j+1
        k=k+1


def mergesort(arr,l,r):
    if l>=r:
        return 0
    mid=(l+r)//2
    mergesort(arr,l,mid)
    mergesort(arr,mid+1,r)
    merge(arr,l,mid,r)
    return arr


print(mergesort([9,2,4,3,5],0,4))