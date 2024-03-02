## Conditional Filter
# Define a function that takes a dictionary as a parameter and returns a dictionary with elements based on a condition.

# Example:

# my_dict = {'a': 1, 'b': 2, 'c': 3, 'd': 4} 
# filtered_dict = filter_dict(my_dict, lambda k, v: v % 2 == 0) 
# Output:{'b': 2, 'd': 4}

def filter_dict(dic,condition):
    return {k: v for k, v in dic.items() if condition(k, v)}

print(filter_dict({'a': 1, 'b': 2, 'c': 3, 'd': 4},lambda k, v: v % 2 == 0))