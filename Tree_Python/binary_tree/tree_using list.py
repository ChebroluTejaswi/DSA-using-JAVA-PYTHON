
class treenode:
    def __init__(self,size):
        self.lis=size*[None]
        self.lastind=0
        self.maxsize=size
        print("Tree created successfully!")
    
    def insert(self,value):
        if self.lastind==self.maxsize-1:
            print("BT is full!")
        else:
            self.lis[self.lastind+1]=value
            self.lastind+=1
            print("value added successfully!")
        
    def search(self,value):
        for i in range(0,self.lastind+1):
            if self.lis[i]==value:
                print("Found!")
                return 1
        return -1

    def in_order(self):
        for i in range(0,self.lastind+1):
            print(self.lis[i],end="\t")
        
    def pre_order(self,index):
        if index> self.lastind: return 
        print(self.lis[index],end="\t")
        self.pre_order(index*2)
        self.pre_order(index*2+1)
    
    def post_order(self,index):
        if index> self.lastind: return 
        self.post_order(index*2)
        self.post_order(index*2+1)
        print(self.lis[index],end="\t")
    
bin_tree=treenode(5)
bin_tree.insert(7)
bin_tree.insert(4)
bin_tree.insert(8)
bin_tree.insert(5)

print(bin_tree.search(14))

print("\ninorder")
bin_tree.in_order()
print("\npreorder")
bin_tree.pre_order(1)
print("\npostorder")
bin_tree.post_order(1)