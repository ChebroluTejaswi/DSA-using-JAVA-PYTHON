class graph:
    def __init__(self,gdic=None):
        if gdic is None:
            self.gdic={}
        self.gdic=gdic

    def addEdge(self,vertex,edge):
        self.gdic[vertex].append(edge)
    
    def dfs(self,vertex):
        visited=[vertex]
        stack=[vertex]

        while stack:
            p=stack.pop()
            print(p)

            for adjv in self.gdic[p]:
                if adjv not in visited:
                    visited.append(adjv)
                    stack.append(adjv)

dic={
    "a":["b","c"],
    "b":["a","d","e"],
    "c":["a","e"],
    "d":["b","e","f"],
    "e":["d","f"],
    "f":["d","e"]    
}

g = graph(dic)
g.dfs("a")

        