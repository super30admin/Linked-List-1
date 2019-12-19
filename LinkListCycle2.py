#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Dec 19 09:15:53 2019

@author: tanvirkaur
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# time complexity = O(n)
# space complexity = O(1)

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return None
        slow = head
        fast = head
        while (fast!= None and fast.next != None):
            slow = slow.next
            fast = fast.next.next 
            if slow == fast:
                slow = head
                while(slow!= fast):
                    slow = slow.next
                    fast = fast.next 
                return slow