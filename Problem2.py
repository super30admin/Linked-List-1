# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
# Your code here along with comments explaining your approach

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(0)
        dummy.next = head
        size = 0
        first = head
        while first:
            first = first.next
            size += 1
        size -= n
        
        
        first = dummy
        while size > 0:
            size-=1
            first = first.next
    
        
        first.next = first.next.next
        
        return dummy.next
