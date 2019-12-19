#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Dec 19 10:32:15 2019

@author: tanvirkaur
"""
# iterative solution
# time complexity = O(n)
# space complexity = O(1) if we donot consider the recursive stack

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # base case
        if head == None or head.next == None:
            return head
        r = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return r