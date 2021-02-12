################## Iterative solution
# Time complexity: O(n)
# Space complexity: O(1)
# Worked on leetcode: yes
# This algorithm uses 3 pointers approach. A fast starts at the 2nd element of linked list, and keeps on moving forward till
# it reaches the None. similarly current keeps on moving to next, till it reaches the last node.
# During this, we keep a pointer, which keeps a track of previous node, and in the while loop, the next pointer of current
# node points to the previous node.
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Linkedlist:
    def __init__(self):
        self.head = None

    # this pushes new node at the beginning of the list
    def push(self, new_data):
        new_node = Node(new_data) # first create a node
        new_node.next = self.head
        self.head = new_node


    def printlist(self):
        temp = self.head
        while (temp):
            print(temp.data, end = " ")
            temp = temp.next


    def reverseList(self):
        prev = None
        current = self.head
        fast = self.head.next

        while (fast != None):
            current.next = prev
            prev = current
            current = fast
            fast = fast.next

        current.next = prev
        self.head = current
        return current



################## Recursive solution
# Time complexity: O(n)
# Space complexity: O(1)
# Worked on leetcode: yes
# This algorithm uses a recursive solution. The recursion stack contains all but last element. The elements are popped
# by one from the stack, and a new connection is built for each node with its previos node, and existing
# connection is broken.


# recursive solution
def reverseList(head):

    # base condition
    if head == None or head.next == None: return head

    recurse_node = reverseList(head.next)

    head.next.next = head  # make a new connection
    head.next = None  # remove the actual connection
    return recurse_node



llist = Linkedlist()
llist.push(1)
llist.push(2)
llist.push(3)
llist.push(4)
llist.push(5)
llist.printlist()
reverse = llist.reverseList()
print("Reversed linked list")
llist.printlist()

