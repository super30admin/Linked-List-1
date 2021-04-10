# Two Pointer Approach
# This approach solves the problem of extra space.
# In this case the time complexity if O(n) and the space complexity if O(1)
# Plus the fun part is getting to use 2 pointers.ArithmeticError
# Just make sure to set the while condition of the first loop properly.
# That condition essentialy deals with list of one element.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head):
        if not head:
            return head

        slow, fast = head, head
        isCycle = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                isCycle = True
                break

        if isCycle:
            slow = head
        else: return None
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
