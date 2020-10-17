# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
"""
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
"""
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        if head is None:
            return None
        
        first = second = head
        while n != 0:
            second = second.next
            n -= 1
            
        if second is None:
            return head.next
        
        while second.next:
            first = first.next
            second = second.next
            
        # delete node next to first
        first.next = first.next.next
        return head
        