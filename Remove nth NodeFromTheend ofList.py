#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Nov  7 10:14:15 2019

@author: tanvirkaur
"""

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# Concept : We maintain two pointer start and end that initiallly points to head node and then we 
#increment our end and decrement our n untill our n becomes zero. This is the reqired window size we want. 
#Now we keep on moving our start and end simultaneously untill our end.next points to null. 
#Then we move our start.next points to one element ahead of it. 
# Time complexity = O(n)
# Space complexity = O(1)
# LeetCode Acceptance = Yes
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        start = head
        end = head
        while (n!=0 and end.next != None):
            end = end.next
            n += -1
        if n == 1:
            return head.next
        if n >1:
            return None
        while( end.next != None):
            start = start.next
            end = end.next
        start.next = start.next.next
        return head