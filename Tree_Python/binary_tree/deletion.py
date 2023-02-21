# Deleting entire tree
# Deleting single node from tree

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

def delete_entire(rootnode):
    rootnode.data=None
    rootnode.leftchild=None
    rootnode.rightchild=None
    print("Entire tree deleted successfully!")

def get_deepest_node(rootnode):
    if not rootnode: return 
    else:
        queue=[]
        queue.append(rootnode)
        while len(queue)!=0:
            root=queue[0]
            queue.pop(0)
            if root.leftchild is not None:
                queue.append(root.leftchild)
            elif root.rightchild is not None:
                queue.append(root.rightchild)
        return root

def delete_deepest_node(rootnode,delnode):
    if not rootnode: 
        return
    else:
        queue=[]
        queue.append(rootnode)
        while len(queue)!=0:
            root=queue[0]
            queue.pop(0)
            if root==delnode:
                root=None
                return
            if root.rightchild:
                if root.rightchild is delnode:
                    root.rightchild =None
                    return
                else:
                    queue.append(root.rightchild) 
            if root.leftchild:
                if root.leftchild is delnode:
                    root.leftchild =None
                    return
                else:
                    queue.append(root.leftchild) 

def delete_node(rootnode,node):
    if not rootnode:
        return "BT does not exist"
    else:
        queue=[]
        queue.append(rootnode)
        while len(queue)!=0:
            root=queue[0]
            queue.pop(0)
            if root.data==node:
                delnode=get_deepest_node(rootnode)
                root.data=delnode.data
                delete_deepest_node(rootnode,delnode)
                print("Node deleted successfully")
            if root.leftchild is not None:
                queue.append(root.leftchild)
            if root.rightchild is not None:
                queue.append(root.rightchild)
        
        return "failed to delete"



bin_tree = treenode(3)
insert(bin_tree,treenode(4))
insert(bin_tree,treenode(5))
insert(bin_tree,treenode(8))
insert(bin_tree,treenode(9))
insert(bin_tree,treenode(6))
level_order(bin_tree)
# delete_entire(bin_tree)
# level_order(bin_tree)

delete_node(bin_tree,4)
level_order(bin_tree)