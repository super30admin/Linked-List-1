#Time Complexity: O(n)
#Space Complexity: O(1)
#Leetcode: Yes


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    
    def push(self,data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
    
    def push_end(self, data):
        new_node = Node(data)
        if self.head == None:
            self.head = new_node
            return
  
        temp = self.head
        while(temp.next):
            temp = temp.next
        temp.next = new_node

    def remove_nth_node_from_end(self, n):
        #Two pointer method
        first, second = self.head, self.head
        for i in range(n):
            first = first.next
        
        if not first.next:
            return self.head.next
        
        while(first.next):
            first = first.next
            second = second.next
        
        second.next = second.next.next

    def printList(self):
        while(self.head):
            print(self.head.data )
            self.head = self.head.next

obj = LinkedList()
arr = [5,4,3,2,1]
arr_end = [1,2,3,4,5]
for i in arr_end:
    obj.push_end(i)

obj.remove_nth_node_from_end(2)
obj.printList()