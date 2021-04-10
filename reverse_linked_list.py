# Node class
class Node:

    # Function to initialize the node object
    def __init__(self, data, next = None):
        self.data = data  # Assign data
        self.next = None  # Initialize
    # next as null


# Linked List class
class LinkedList:

    # Function to initialize the Linked
    # List object
    def __init__(self):
        self.head = None

    def printList(self):
        temp = self.head
        while (temp):
            print (temp.data)
            temp = temp.next


    def reverseList(self):
        '''
        take a prev and curr pointing to NONE and head
        while current is not none, take a temp node, and assign to previous
        assign previous to current , and reverse the current's next link to previous
        have the current node as previous and current node as the next one in the list
        '''
        head = self.head
        prev, curr = None, head
        while curr:
            temp = prev
            prev = curr
            curr = curr.next
            prev.next = temp
        self.head = prev

# driver code

llist = LinkedList()

llist.head = Node(1)
second = Node(2)
third = Node(3)

llist.head.next = second  # Link first node with second
second.next = third  # Link second node with the third node
llist.printList()
llist.reverseList()
print("*******")

llist.printList()

'''
Complexity analysis
Time complexity : O(n) n list of length
Space complexity : O(1)
'''