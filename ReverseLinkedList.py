#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Nov  7 09:39:48 2019

@author: tanvirkaur
"""

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# we are using two pointer approach to reverse a link list. We maintain two pointers curr and temp. After every iteration the  curr is moved forward one step. Time complexity = O(n), Space complexity = O(1)
# h,c-t
# 1-  2- 3 - 4 - 5 - Null
#.       h- c- t
#Step 1: 2 - 1-3-4-5-Null, 3-2-1-4-5-Null,.......
# our temp turns out to be head in the end
    
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None or head.next == None:
            return head
        curr = head
        temp = None
        while(curr.next != None):
            temp = curr.next
            curr.next = temp.next
            temp.next = head
            head = temp
        
        return head