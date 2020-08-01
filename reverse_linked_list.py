################## Iterative solution
# Time complexity: O(n)
# Space complexity: O(1)
# Worked on leetcode: yes
# This algorithm uses 3 pointers approach. A fast starts at the 2nd element of linked list, and keeps on moving forward till
# it reaches the None. similarly current keeps on moving to next, till it reaches the last node.
# During this, we keep a pointer, which keeps a track of previous node, and in the while loop, the next pointer of current
# node points to the previous node.


def reverseList(head):
    prev = None
    current = head
    fast = head.next

    while (fast != None):
        current.next = prev
        prev = current
        current = fast
        fast = fast.next

    current.next = prev
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

