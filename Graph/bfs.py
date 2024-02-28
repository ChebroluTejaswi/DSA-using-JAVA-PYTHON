class graph:
    def __init__(self,gdic=None):
        if gdic is None:
            self.gdic={}
        self.gdic=gdic

    def addEdge(self,vertex,edge):
        self.gdic[vertex].append(edge)
    
    def bfs(self,vertex):
        visited=[vertex]
        q=[vertex]

        while q:
            e=q.pop(0)
            print(e)
            for adjv in self.gdic[e]:
                if adjv not in visited:
                    visited.append(adjv)
                    q.append(adjv)

dic={
    "a":["b","c"],
    "b":["a","d","e"],
    "c":["a","e"],
    "d":["b","e","f"],
    "e":["d","f"],
    "f":["d","e"]    
}

g = graph(dic)
g.bfs("a")

        