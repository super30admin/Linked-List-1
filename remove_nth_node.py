# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        :SC:O(1)
        :TC:O(n)
        """
        #if head.next is None and n==1: return None
        # create dummy node to handle situation excpetional cases
        dummy = ListNode(5)
        dummy.next=head
        
        slow=fast=dummy
        count=0
        while count<n:
            fast=fast.next
            count+=1
        
        while fast.next is not None:
            fast=fast.next
            slow=slow.next
        
        slow.next=slow.next.next
        
        return dummy.next
    
    
        
        