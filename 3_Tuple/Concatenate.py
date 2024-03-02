## Concatenate

# Write a function that takes a tuple of strings and concatenates them, separating each string with a space.

# Example
# input_tuple = ('Hello', 'World', 'from', 'Python')
# output_string = concatenate_strings(input_tuple)
# print(output_string)  # Expected output: 'Hello World from Python

def concatenate(tup):
    res=""
    for i in tup:
        res=res+i+" "
    return res
    # return ' '.join(input_tuple)

print(concatenate(('Hello', 'World', 'from', 'Python')))