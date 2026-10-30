
class Node:
    def __init__(self, value, prev=None):
        self.value = value
        self.prev = prev
        self.next = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.len = 0

    def printdll(self):
        if self.len <= 0:
            print("The doubly linked list is empty!")
            return
        temp = self.head
        while temp != None:
            print(temp.value, ", ")
            temp = temp.next

    def insertAtBeginning(self):
        value = int(input("Enter the value to add: "))
        if self.len == 0:
            self.head = Node(value)
        else:
            newnode = Node(value)
            newnode.next = self.head
            self.head.prev = newnode
            self.head = newnode
        self.len += 1
    
    def insertAtEnd(self):
        value = int(input("Enter the value to add: "))
        if self.len == 0:
            self.head = Node(value)
        else:
            temp = self.head
            while temp.next != None:
                temp = temp.next
            newnode = Node(value)
            newnode.prev = temp
            temp.next = newnode
        self.len += 1

    def insertAtIndex(self):
        value = int(input("Enter the value to add: "))
        index = int(input("Enter the index: "))
        if index < 0 or index > self.len:
            print("Please enter a valid index!")
            return
        
        if self.len == 0:
            if index != 0:
                print("The doubly lined list is empty u can only insert at index 0!")
                return;
            self.head = Node(value)
        elif self.len == index:
            self.insertAtEnd()
        else:
            value = int(input("Enter the value to add: "))
            temp = self.head
            for i in range(1,index-1):
                temp = temp.next
            newnode = Node(value)
            newnode.next = temp.next
            temp.next.prev = newnode
            newnode.prev = temp
            temp.next = newnode
        self.len +=1


    def insert(self):
        choice = int(input("Enter '1' to insert at the beginning\nEnter '2' to insert at end\nEnter '3' to insert at any index"))
        if choice == 1:
            self.insertAtBeginning()
        elif choice == 2:
            self.insertAtEnd()
        elif choice == 3:
            self.insertAtIndex()
        else:
            print("Please enter a valid choice!")
            return


dll = DoublyLinkedList()
while True:
    print("Enter '1' to Print the list")
    print("Enter '2' to insert in the list")

    choice = int(input("Enter your choice:- "))
    if choice == 1:
        dll.printdll()
    elif choice == 2:
        dll.insert()