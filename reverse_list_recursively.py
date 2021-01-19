# -*- coding: utf-8 -*-
"""
TC : O(N) as we traverse the linked list and store all the elements
SC :O(N) as stack used
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
        
        reverse = self.reverseList(head.next)
        #print(head.val)
        head.next.next = head
        head.next = None
        return reverse