

class treenode:
    def __init__(self,data): # Creates new bonary tree node
        self.data=data
        self.leftchild=None
        self.rightchild=None
    

def pre_order(rootnode):
    if not rootnode: 
        return
    print(rootnode.data,end="\t")
    pre_order(rootnode.leftchild)
    pre_order(rootnode.rightchild)

def in_order(rootnode):
    if not rootnode: 
        return
    in_order(rootnode.leftchild)
    print(rootnode.data,end="\t")
    in_order(rootnode.rightchild)

def post_order(rootnode):
    if not rootnode: 
        return
    post_order(rootnode.leftchild)
    post_order(rootnode.rightchild)
    print(rootnode.data,end="\t")

def level_order(rootnode):
    if not rootnode:
        return 
    else:
        queue=[]
        queue.append(rootnode)
        while len(queue)!=0:
            root=queue[0]
            queue.pop(0)
            print(root.data,end="\t")
            if root.leftchild is not None:
                queue.append(root.leftchild)
            if root.rightchild is not None:
                queue.append(root.rightchild)



bin_tree = treenode(3)
lc = treenode(4)
rc = treenode(5)
bin_tree.leftchild=lc
bin_tree.rightchild=rc
lc.leftchild=treenode(8)
lc.rightchild=treenode(9)
rc.leftchild=treenode(6)
print("\npre-order")
pre_order(bin_tree)
print("\nin-order")
in_order(bin_tree)
print("\npost-order")
post_order(bin_tree)

print("\nlevel-order")
level_order(bin_tree)



