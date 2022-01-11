# Time Complexity : O(n) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No
# Reverse Linked List
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        previous, current = None, head
        while current is not None:
            next1 = current.next
            current.next = previous
            previous = current
            current = next1
            
        return previous