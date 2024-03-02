## Contains Duplicate

# Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
# Example :
# Input: nums = [1,2,3,1]
# Output: true

def contains_duplicate(arr):
    if len(arr)==len(set(arr)):
        return False
    return True

print(contains_duplicate([1,2,3,1]))