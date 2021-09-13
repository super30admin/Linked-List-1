#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Sep 12 02:00:53 2021

@author: ameeshas11
"""

#Time Complexity : O(n)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        nex = ListNode(0, None)
        while curr != None:
            nex = curr.next
            curr.next = prev
            prev = curr
            curr = nex
        return prev