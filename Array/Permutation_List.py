## Permutation List

# Check if two lists are permutations of each other.
# Example:
# [1,2,3] and [3,1,2] - Return True
# [1,2,3] and [1,2,3,1] - Return False

def check_permutation(arr1,arr2):
    if len(arr1)==len(arr2):
        arr1.sort()
        arr2.sort()
        if arr1==arr2:
            return True
    return False

print(check_permutation([1,2,3],[3,1,2]))
print(check_permutation([1,2,3],[1,2,3,1]))