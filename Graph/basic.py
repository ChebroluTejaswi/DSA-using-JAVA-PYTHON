# Adjacency list 

class graph:
    def __init__(self,gdic=None):
        if gdic is None:
            gdic={}
        self.gdic=gdic
    
    def addVertex(self,vertex):
        if vertex not in self.gdic.keys():
            self.gdic[vertex]=[]
            return True
        return False

    def removeVertex(self,vertex):
        if vertex in self.gdic.keys():
            for v in self.gdic[vertex]:
                self.gdic[v].remove(vertex)
            del self.gdic[vertex]
            return True
        return False


    def addEdge(self,vertex1,vertex2):
        if vertex1 in self.gdic.keys() and vertex2 in self.gdic.keys():
            self.gdic[vertex1].append(vertex2)
            self.gdic[vertex2].append(vertex1)
            return True
        return False

    def removeEdge(self,vertex1,vertex2):
        if vertex1 in self.gdic.keys() and vertex2 in self.gdic.keys():
            try:
                self.gdic[vertex1].remove(vertex2)
                self.gdic[vertex2].remove(vertex1)
                return True
            except ValueError:
                print("Edge doesn't exist!")
        return False
    
    def printGraph(self):
        for vertex in self.gdic:
            print(vertex,":",self.gdic[vertex])
        print("--------------------------------------")


g= graph()
g.addVertex("A")
g.addVertex("B")
g.addVertex("C")
g.printGraph()

g.addEdge("A","B")
g.addEdge("A","C")
g.addEdge("B","C")
g.printGraph()

g.removeEdge("A","C")
g.printGraph()

g.removeVertex("A")
g.printGraph()