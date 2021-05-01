# -*- coding: utf-8 -*-
"""
Created on Fri Apr 30 23:01:10 2021

@author: jgdch
"""

#Time Complexity:O(N), N is the number of nodes in the linked list
#Space Complexity:O(1)
#All lc testcases passed
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev=None
        while head:
            
            cur=head
            head=head.next
            cur.next=prev
            prev=cur
        return prev
        