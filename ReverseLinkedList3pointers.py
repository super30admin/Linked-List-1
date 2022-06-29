# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    '''Time Complexity: O(n)
    Space Complexity: O(1)'''
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #No need to reverse
        if head is None:
            return head
        
        #Three pointers
        prev=None
        curr=head
        fast=head.next
        
        while fast is not None:
            curr.next=prev
            prev=curr
            curr=fast
            fast=fast.next
            
        curr.next=prev
        return curr
        
