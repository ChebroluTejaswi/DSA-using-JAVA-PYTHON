def binary_search(arr,value):
    s=0
    e=len(arr)-1
    mid=(s+e)//2
    while s<=e and arr[mid]!=value:
        if arr[mid]>value:
            e=mid-1
        else:
            s=mid+1
        mid=(s+e)//2
    
    if arr[mid]==value:
        return "found"
    else:
        return "not found"

print(binary_search([9,18,27],3))
print(binary_search([9,18,27],9))
