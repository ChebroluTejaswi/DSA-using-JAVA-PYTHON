class treenode:
    def __init__(self,data):
        self.data=data
        self.leftchild=None
        self.rightchild=None
    
def search(rootnode,target):
# performing level order traversal
    if not rootnode: return 
    else:
        queue=[]
        queue.append(rootnode)
        while len(queue)!=0:
            root=queue[0]
            queue.pop(0)
            if root.data==target: return 1
            if root.leftchild is not None:
                queue.append(root.leftchild)
            if root.rightchild is not None:
                queue.append(root.rightchild)
    return 0


bin_tree = treenode(3)
lc = treenode(4)
rc = treenode(5)
bin_tree.leftchild=lc
bin_tree.rightchild=rc
lc.leftchild=treenode(8)
lc.rightchild=treenode(9)
rc.leftchild=treenode(6)

print(search(bin_tree,9))