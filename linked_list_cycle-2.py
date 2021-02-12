# Time complexity: O(n)
# Space complexity: O(1)
# Worked on leetcode: yes
# This algorithm uses 2 pointers approach. A slow pointer moves at a 1x speed, and a fast pointer moves
# at a 2x speed. If there is a cycle, both pointers must coincide.
# To find the node at which cycle starts, we initialize a 3rd pointer at the head, and either of fast/ slow pointers along with 3rd pointer
# move with 1x speed. The node where they meet, is the node from where the cycle starts.


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

    def hasCycle(self):
        if self.head == None or self.head.next == None:
            return False

        slow = self.head
        fast = self.head

        while (fast.next != None and fast.next.next != None):
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                return True

        return False


    def detectCycle(self):
        slow = self.head
        fast = self.head

        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                curr = self.head
                while (curr != slow):
                    curr = curr.next
                    slow = slow.next

                return slow

        return None


llist = Linkedlist()
llist.push(5)
llist.push(4)
llist.push(3)
llist.push(2)
llist.push(1)
llist.head.next.next.next.next = llist.head.next
#llist.printlist() # will keep on printing infinitely
print(llist.hasCycle())
print(llist.detectCycle().data)


