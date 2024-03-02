# Count Word Frequency

# Define a function to count the frequency of words in a given list of words.

# Example:
# words = ['apple', 'orange', 'banana', 'apple', 'orange', 'apple'] 
# count_word_frequency(words) 
# Output: {'apple': 3, 'orange': 2, 'banana': 1}

def cwf(words):
    dic={}
    for i in words:
        if i in dic:
            dic[i]=dic[i]+1
        else:
            dic[i]=1
    return dic

words = ['apple', 'orange', 'banana', 'apple', 'orange', 'apple']

print(cwf(words))
