# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

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
        fast=head
        slow=head
        cycle=False

        while(fast and fast.next):
            slow=slow.next
            fast=fast.next.next
            if fast==slow:
                cycle=True
                break

        if cycle:
            fast=head
            while(fast!=slow):
                fast=fast.next
                slow=slow.next
        else:
            return None
        return fast

        