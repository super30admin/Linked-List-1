# Time Complexity : O(n) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        first = second = head
        for _ in range(n):
            first = first.next
        if not first:
            return head.next
        
        while first.next:
            first = first.next
            second = second.next
        second.next = second.next.next
        
        return head