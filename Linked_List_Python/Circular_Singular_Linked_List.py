class node :
    def __init__(self,data):
        self.data=data
        self.next=None
    
class linked_list():
    def __init__(self):
        self.head=None
        self.tail=None
        self.size=0
    
    def insert(self,data,loc):
        if loc==0:
            if self.head is None:
                self.head=node(data)
                self.tail=self.head
            else:
                n=node(data)
                self.tail.next=n
                n.next=self.head
                self.head=n
            self.size+=1

        elif loc>=self.size:
            if self.head is None:
                self.head=node(data)
                self.tail=self.head
            else:
                n=node(data)
                self.tail.next=n
                self.tail=n
                n.next=self.head
            self.size+=1
            
        else:
            ind=0
            temp=self.head
            while(ind<loc-2):
                temp=temp.next
            n=node(data)
            n.next=temp.next
            temp.next=n

            self.size+=1

    def delete(self,loc):
        if self.head==None:
            print("linked list doesn't exist!")
            
        else:
            if loc==0:
                self.head=self.head.next
                self.tail.next=self.head
            elif loc>=self.size:
                ind=0
                temp=self.head
                while ind<self.size-1:
                    ind=ind+1
                    temp=temp.next

                temp=temp.next
                self.tail=temp 
            else:
                ind=0
                print("middle")
                temp=self.head
                while ind<(loc-1):
                    temp=temp.next
                    ind+=1
                temp.next=temp.next.next

            self.size-=1


    def traverse(self):
        ind=0
        temp=self.head
        while(ind<self.size):
            print(temp.data,end="\t")
            temp=temp.next
            ind=ind+1
        print()

cll=linked_list()
cll.insert(4,0)
cll.insert(7,0)
cll.insert(9,5)
cll.insert(5,2)
cll.insert(9,2)
cll.traverse()
cll.delete(0)
cll.traverse()
cll.delete(4)
cll.traverse()
cll.delete(1)
cll.traverse()
