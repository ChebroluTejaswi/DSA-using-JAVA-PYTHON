## Reverse

# Reverse the elements of Array

def reverse(arr):
    for i in range(0,len(arr)//2):
        arr[i],arr[len(arr)-1]=arr[len(arr)-1],arr[i]
    return arr

print(reverse([9,3,2]))