#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Sep 12 17:29:45 2021

@author: ameeshas11
"""

#Time Complexity : O(n)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        if head== None or head.next == None:
            return None
        slow = head
        fast = head
        flag = 0
        
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = 1
                break
        
        if flag == 1:
            fast = head
            while fast!=slow:
                slow = slow.next
                fast = fast.next
            return fast
        else:
            return None