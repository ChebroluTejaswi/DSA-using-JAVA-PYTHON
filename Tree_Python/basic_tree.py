class treenode:
    def __init__(self,data,children=[]):
        self.data=data
        self.children=children
    
    def __str__(self,level=0):
        res=(" " * level)+str(self.data)+"\n"
        for child in self.children:
            res=res+child.__str__(level+1)
        return res

    def addchildren(self,treenode):
        self.children.append(treenode)
    
tree = treenode("drinks",[])
cold = treenode("cold",[])
hot = treenode("hot",[])

tree.addchildren(cold)
tree.addchildren(hot)
print(tree)