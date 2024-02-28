class graph:
    def __init__(self,gdic=None):
        if gdic==None:
            self.gdic={}
        self.gdic=gdic
    
    def bfs(self,start,end):
        queue=[]
        queue.append([start])

        while queue:
            path = queue.pop(0)
            node=path[-1]
            print("queue: ",queue,"\t path: ",path)
            if node==end: # reached destination
                return path
            for adj in self.gdic.get(node,[]):
                new_path=list(path)
                new_path.append(adj)
                queue.append(new_path)

dic={
    "a":["b","c"],
    "b":["d","g"],
    "c":["d","e"],  
    "d":["f"],
    "e":["f"],
    "g":["f"]
}
g=graph(dic)
print(g.bfs("a","f"))