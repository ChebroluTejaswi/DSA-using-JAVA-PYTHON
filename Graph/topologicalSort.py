from collections import defaultdict

class graph:
    def __init__(self,vertexcount):
        self.graph = defaultdict(list)
        self.numvertices=vertexcount
    
    def addEdge(self,vertex,edge):
        self.graph[vertex].append(edge)

    def topologicalSortUtil(self,v,visited,stack):
        visited.append(v)

        for i in self.graph[v]:
            if i not in visited:
                self.topologicalSortUtil(i,visited,stack)
            
        stack.insert(0,v)

    def topologicalSort(self):
        visited=[]
        stack=[]

        for k in list(self.graph):
            if k not in visited:
                self.topologicalSortUtil(k,visited,stack)
        print(stack)

g= graph(8)
g.addEdge("a","c")
g.addEdge("c","e")
g.addEdge("e","h")
g.addEdge("e","f")
g.addEdge("f","g")
g.addEdge("b","d")
g.addEdge("b","c")
g.addEdge("d","f")

g.topologicalSort()