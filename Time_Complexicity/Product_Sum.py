## Product and Sum

# Calculate the product and sum of all elements in array

def product_sum(arr):
    s=0
    p=1

    for i in arr:
        s=s+i
        p=p*i
    return [s,p]

print(product_sum([1,4,3]))