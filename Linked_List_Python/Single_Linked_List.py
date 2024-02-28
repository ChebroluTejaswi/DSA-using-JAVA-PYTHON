class node:
    def __init__(self,data):
        self.data=data
        self.next=None

class linked_list:
    
    def __init__(self):
        self.head=None
        self.tail=None
        self.size=0

    def insert(self,data,loc):
        if loc==0:
            if self.head==None:
                self.head=node(data)
                self.head.next=None
                self.tail=self.head
            else:
                n=node(data)
                n.next=self.head
                self.head=n
            self.size+=1

        elif loc>=self.size:
            if self.head==None:
                self.head=node(data)
                self.head.next=None
                self.tail=self.head
            else:
                n=node(data)
                n.next=None
            self.size+=1
        else:
            ind=0
            temp=self.head
            while(ind<loc-2):
                temp=temp.next
                ind=ind+1
            n=node(data)
            n.next=temp.next
            temp.next=n
            self.size+=1

    def delete(self,loc):
        if loc==0:
            if self.head==None:
                print("linked list doesn't exist!")
            else:
                self.head=self.head.next
                self.size-=1

        elif loc>=self.size:
            if self.head==None:
                print("linked list doesn't exist")
            else:
                ind=0
                temp=self.head 
                while ind<self.size-2:
                    temp=temp.next
                    ind+=1
                temp.next=None
                self.tail=temp 
                self.size-=1

        else:
            ind=0
            temp=self.head
            while(ind<loc-1):
                temp=temp.next
                ind=ind+1
            temp.next=temp.next.next
            self.size-=1


    def traverse(self):
        temp =self.head
        for i in range(self.size):
            print(temp.data,end="\t")
            temp=temp.next
        print()

ll=linked_list()
ll.insert(4,0)
ll.insert(2,0)
ll.insert(3,9)
ll.insert(9,12)
ll.insert(8,2)
ll.insert(7,4)
ll.traverse()
ll.delete(0)
ll.traverse()
ll.delete(9)
ll.traverse()
ll.delete(1)
ll.traverse()

    
