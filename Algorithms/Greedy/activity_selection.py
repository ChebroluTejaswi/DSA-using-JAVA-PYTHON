activities=[['A1',0,6],
            ['A2',3,4],
            ['A3',1,2],
            ['A4',5,8],
            ['A5',5,7],
            ['A6',8,9]]
# sort activities based on finish time
# fun=lambda x:x[2]
# print(fun([1,2,3]))
activities.sort(key=lambda x:x[2])
# print(activities)
count=0
i=0
first=activities[i][1]
for j in range(len(activities)):
    if activities[j][1]>=activities[i][2]:
        print(activities[i][2]," ",activities[i+1][1])
        count=count+1
        i=j

print(count)
