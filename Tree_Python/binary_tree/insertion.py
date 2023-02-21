# there are two cases 
# 1. Root is blank
# 2. tree exists and we have to look for first vacant place

class treenode:
    def __init__(self,data):
        self.data=data
        self.leftchild=None
        self.rightchild=None
    
def insert(rootnode,newnode):
    if not rootnode:  # case 1
        rootnode=newnode
    else: # case 2
        queue=[]
        queue.append(rootnode)
        while len(queue)!=0:
            root=queue[0]
            queue.pop(0)
            if root.leftchild is None:
                root.leftchild=newnode
                print("successfully inserted : left")
                break
            elif root.rightchild is None:
                root.rightchild=newnode
                print("successfully inserted : right")
                break
            else:
                queue.append(root.leftchild)
                queue.append(root.rightchild)

def in_order(rootnode):
    if not rootnode: 
        return
    in_order(rootnode.leftchild)
    print(rootnode.data,end="\t")
    in_order(rootnode.rightchild)

bin_tree = treenode(3)
insert(bin_tree,treenode(4))
insert(bin_tree,treenode(5))
insert(bin_tree,treenode(8))
insert(bin_tree,treenode(9))
insert(bin_tree,treenode(6))
in_order(bin_tree)