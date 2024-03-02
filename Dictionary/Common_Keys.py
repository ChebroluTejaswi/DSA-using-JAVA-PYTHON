## Common Keys

# Define a function with takes two dictionaries as parameters and merge them and sum the values of common keys.
# Example:
# dict1 = {'a': 1, 'b': 2, 'c': 3}
# dict2 = {'b': 3, 'c': 4, 'd': 5}
# merge_dicts(dict1, dict2)
# Output:
# {'a': 1, 'b': 5, 'c': 7, 'd': 5}

def common_keys(dic1,dic2):
    res=dic1.copy()
    for key,value in dic2.items():
        res[key]=res.get(key,0)+value
    return res


print(common_keys({'a': 1, 'b': 2, 'c': 3},{'b': 3, 'c': 4, 'd': 5}))