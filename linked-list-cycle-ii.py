# Time Complexity : O(n) - n is number of elements in the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
To detect a cycle:
Use slow and fast pointers
Slow pinter moves 1 step, fast pointer moves 2 steps, if there is a cycle slow and fast pointer
will meet at some point

To find the start point of cycle:
Move slow pointer to head and then move slow and fast both by 1 step,
when they meet that is the starting point of the cycle
"""


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """

        slow = head
        fast = head
        cycleFound = False

        while (fast is not None and fast.next is not None):
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                cycleFound = True
                break

        if cycleFound:
            slow = head
            while (slow != fast):
                slow = slow.next
                fast = fast.next

            return slow
        else:
            return None