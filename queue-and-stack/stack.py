class Node:
    def __init__(self, value, prev = None):
        self.value = value
        self.prev = prev

class Stack:
    def __init__(self):
        self.top = None

    def printStack(self):
        if self.top == None:
            print("[]")
            return
        temp = self.top
        while temp != None:
            print(temp.value, ", ", end="")
            temp = temp.prev
        print()

    def push(self, value):
        newnode = Node(value, self.top)
        self.top = newnode
    
    def seek(self):
        if self.top == None:
            print("The stack is empty!")
            return
        return self.top.value

    def pop(self):
        if self.top == None:
            print("The stack is already empty!")
            return
        self.top = self.top.prev


stk = Stack()
stk.pop()
stk.seek()
stk.push(1)
stk.push(2)
stk.push(3)
stk.printStack()
stk.push(4)
stk.push(5)
stk.printStack()
stk.pop()
stk.pop()
stk.printStack()