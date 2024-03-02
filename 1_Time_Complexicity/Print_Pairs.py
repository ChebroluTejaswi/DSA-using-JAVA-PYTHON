## Print Pairs

# Print pairs of elements present in array

def print_pairs(arr):
    for i in arr:
        for j in arr:
            print(str(i)+"-",str(j))

print_pairs([1,6,7])