
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head
        
        prev=None
        curr=head
        fast= head.next
        
        while(fast is not None):
            curr.next = prev
            prev = curr
            curr = fast
            fast= fast.next
            
        curr.next = prev
        return curr