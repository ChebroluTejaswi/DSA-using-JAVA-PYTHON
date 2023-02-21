# divide and conquer approach: Recursively half the array till they can't be splitted further
# merge the sorted halves
arr=[3,9,1,7,4]

def merge(arr,l,mid,r):
    n1=mid-l+1
    n2=r-mid
    left_arr=[0]*(n1)
    right_arr=[0]*(n2)
    for i in range(0,n1):
        left_arr[i]=arr[l+i]
    for i in range(0,n2):
        right_arr[i]=arr[mid+1+i]
    
    i=0
    j=0
    k=l
    while i<n1 and j<n2:
        if left_arr[i]<=right_arr[j]:
            arr[k]=left_arr[i]
            i=i+1
        else:
            arr[k]=right_arr[j]
            j=j+1
        k=k+1
    
    while i<n1:
        arr[k]=left_arr[i]
        i=i+1
        k=k+1
    while j<n2:
        arr[k]=right_arr[j]
        j=j+1
        k=k+1
    

def merge_sort(arr,l,r):
    if r>l:
        mid=(l+r)//2
        merge_sort(arr,l,mid)
        merge_sort(arr,mid+1,r)
        merge(arr,l,mid,r)



merge_sort(arr,0,len(arr)-1)
print(arr)