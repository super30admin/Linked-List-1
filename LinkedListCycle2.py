#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Nov  7 09:40:23 2019

@author: tanvirkaur
"""

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
#Cocept : If there are two persons starting from the same point in the circle one traveling with the speed x and other with 2x they will definately meet at some point. The node where the cycle begins is the number of steps taken from the head node to reach to the cycle node is equal to the number of steps taken from the slow node to reach to the head node.
# Time complexity = ?
# Space complexity = O(1)
# Leetcode accceptace = yes 

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
       """
        slow = head
        fast = head
        while(fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            if(slow == fast):
                while(slow != head):
                    head = head.next
                    slow = slow.next
                return slow
        return None