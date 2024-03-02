## Same Frequency

# Define a function which takes two lists as parameters and check if two given lists have the same frequency of elements.

# Example:
# list1 = [1, 2, 3, 2, 1]
# list2 = [3, 1, 2, 1, 3]
# check_same_frequency(list1, list2)
# Output: False

def check_freq(list1,list2):
    dic={}
    for i in list1:
        if i in dic:
            dic[i]=dic[i]+1
        else:
            dic[i]=1
    
    for i in list2:
        dic[i]=dic[i]-1

    for key,value in dic.items():
        if value!=0:
            return False
    return True

print(check_freq([1, 2, 3, 2, 1],[3, 1, 2, 1, 3]))