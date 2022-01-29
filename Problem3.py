#Time Complexity: O(n) 
#Space Complecity: O(1)
#Leetcode: Yes
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Solution:
    def __init__(self):
        self.head =None

    def append(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return        
        temp = self.head
        while(temp):
            temp = temp.next
        temp.next = new_node

    def detectCycle(self, head):
        slow, fast = self.head, self.head

        if slow is None or slow.next is None:
            return
        
        #Detect if there is a cycle present, if yes slow and fast will be equal.
        while(fast and fast.next):
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                break
        else:
            return 

        #Find the point at Which cycle starts
        new_slow = self.head
        while(new_slow != fast):
            new_slow = new_slow.next
            fast = fast.next

        return new_slow