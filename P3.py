# -*- coding: utf-8 -*-
"""
Created on Fri Apr 30 23:02:55 2021

@author: jgdch
"""

#Time Complexity:O(N), N is the number of nodes in the linked list
#Space Complexity:O(1)
#All lc testcases passed

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        fast, slow = head, head
        while fast and fast.next:
            
            slow, fast = slow.next, fast.next.next
            
            if slow == fast: break

        if not fast or not fast.next: return None

        while head != slow:
            head, slow = head.next, slow.next

        return slow