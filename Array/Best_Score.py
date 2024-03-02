## Best Score

# Given a list, write a function to get first, second best scores from the list.
# List may contain duplicates.

# Example
# myList = [84,85,86,87,85,90,85,83,23,45,84,1,2,0]
# first_second(myList) # 90 87

def best_score(arr):
    arr=list(set(arr))
    arr.sort()
    return [arr[-1],arr[-2]]

print(best_score([84,85,86,87,85,90,85,83,23,45,84,1,2,0]))