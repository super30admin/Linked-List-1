# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

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
        """
        if head is None:
            return None
        
        dummy = ListNode(0)
        dummy.next = head
        slow = dummy
        fast = dummy
        
        count = 0
        
        while(count<=n):
            count+=1
            fast= fast.next
            
        while(fast!=None):
            slow = slow.next
            fast= fast.next
            
        slow.next = slow.next.next
        return dummy.next