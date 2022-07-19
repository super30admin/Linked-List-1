# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

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
        if head is None:
            return None
        
        slow=head
        fast=head
        hasCycle = False
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast=fast.next.next
            if slow is fast:
                hasCycle = True
                break
        
        if not hasCycle:
            return None
        
        slow = head
        
        while(fast!=slow):
            slow = slow.next
            fast = fast.next
            
        return slow    
        