#Time Complexity:O(n)
#Space Complexity:O(1)

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
        x=False
        slow=head
        fast=head
        while(fast!=None and fast.next!=None):
            fast=fast.next.next
            slow=slow.next
            if fast==slow:
                x=True
                break
        if not x:
            return None
        fast=head
        while(slow!=fast):
            slow=slow.next
            fast=fast.next
        return fast