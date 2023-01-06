items=[[20,100],
       [30,120],
       [10,60]]
items.sort(key=lambda x:(x[0]/x[1]))

max_val=0
w=50
for i in range(len(items)):
    if w>items[i][0]:
        max_val=max_val+items[i][1]
        w=w-items[i][0]
    else:
        frac=w/items[i][0]
        max_val=max_val+((items[i][1])*frac)
        break

print(int(max_val))