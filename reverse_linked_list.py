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


