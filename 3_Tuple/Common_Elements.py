## Common Elements

# Write a function that takes two tuples and returns a tuple containing the common elements of the input tuples.

# Example

# tuple1 = (1, 2, 3, 4, 5)
# tuple2 = (4, 5, 6, 7, 8)
# output_tuple = common_elements(tuple1, tuple2)
# print(output_tuple)  # Expected output: (4, 5)

def common(tup1,tup2):
    res=[]
    for i in tup1:
        if i in tup2:
            res.append(i)
    return tuple(res)
    # return tuple(set(tuple1) & set(tuple2))

print(common((1, 2, 3, 4, 5),(4, 5, 6, 7, 8)))