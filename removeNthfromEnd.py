# Time Complexity : O(N) 
# Space Complexity :    O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        
        for i in range(n+1):
            fast=fast.next
            
        while(fast!=None):
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        return dummy.next