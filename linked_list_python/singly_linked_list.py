
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
    
class LinkedList:
    def __init__(self, data):
        newnode = Node(data)
        self.head = newnode
        self.len = 1

    def printList(self):
        temp = self.head
        while temp != None:
            print(temp.data, ", ", end="")
            temp = temp.next
        print()
    
    def insertAtFirst(self, value):
        newnode = Node(value)
        newnode.next = self.head
        self.head = newnode
        self.printList()
        self.len += 1

    def insertAtEnd(self, value):
        newnode = Node(value)
        lastElem = self.head
        while lastElem.next != None:
            lastElem = lastElem.next
        lastElem.next = newnode
        self.printList()
        self.len += 1

    def insertAtIndex(self, value, index):
        newnode = Node(value)
        temp = self.head
        for i in range(1,index-1):
            temp = temp.next
        newnode.next = temp.next
        temp.next = newnode
        self.printList()
        self.len += 1

    def deleteFirstIndex(self):
        if self.head == None:
            print("The linked list is already empty.")
            return
        self.head = self.head.next
        self.printList()
        self.len -= 1

    def deleteLastIndex(self):
        if self.head == None:
            print("The linked list is already empty.")
            return
        temp = self.head
        while temp.next.next != None:
            temp = temp.next
        temp.next = None
        self.printList()
        self.len -= 1

    def deleteAtIndex(self, index):
        if self.head == None:
            print("The linked list is already empty.")
            return
        if index == 0:
            self.deleteFirstIndex()
            return
        if index+1 == self.len:
            self.deleteLastIndex()
            return
        temp = self.head
        for i in range(1, index-1):
            temp = temp.next
        temp.next = temp.next.next
        self.printList()
        self.len -= 1
    

lst = LinkedList(1)
lst.printList()
lst.insertAtFirst(0)
lst.insertAtEnd(5)
lst.insertAtIndex(2,3)
lst.insertAtEnd(6)
lst.insertAtEnd(7)
lst.insertAtEnd(8)

lst.deleteFirstIndex()
lst.deleteLastIndex()
lst.deleteAtIndex(4)