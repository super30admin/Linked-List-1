# -*- coding: utf-8 -*-
"""
TC : O(N) for list traversal
SC : O(1) as no extra space
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        #base condition
        if head is None or head.next is None:
            return head
        
        #initailize pointers
        prev = None
        curr = head
        fast = head.next        
        
              
        while fast:            
            
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
            
        curr.next = prev
        return curr