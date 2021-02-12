# Time complexity: O(n)
# Space complexity: O(1)
# Worked on leetcode: yes
# This algorithm uses 2 pointers approach. A fast pointer moves n steps. From there, the fast and slow
# keeps on moving till fast pointer reaches the last node. The node next to the slow pointer is the one which is to be removed.

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

    def removeNthFromEnd(self, n):
        dummy = Node(-1) # dummy node
        slow = dummy
        fast = dummy

        dummy.next = self.head

        count = 0
        while (count <= n):
            fast = fast.next
            count = count + 1

        while fast.next != None:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next  # fast
        self.head = dummy.next

        return dummy.next # if we return head here, it will fail for 1 element case



llist = Linkedlist()
llist.push(5)
llist.push(4)
llist.push(3)
llist.push(2)
llist.push(1)
llist.printlist()
reverse = llist.removeNthFromEnd(2)
print("Removed element")
llist.printlist()


