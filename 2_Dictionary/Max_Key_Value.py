## Key with the Highest Value

# Define a function which takes a dictionary as a parameter and returns the key with the highest value in a dictionary.

# Example:
# my_dict = {'a': 5, 'b': 9, 'c': 2}
# max_value_key(my_dict))
# Output:b

def max_key_value(dic):
    return max(dic,key=dic.get)
    

print(max_key_value({'a':5,'b':9,'c':2}))