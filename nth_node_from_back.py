#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Sep 12 17:27:16 2021

@author: ameeshas11
"""

#Time Complexity : O(n)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head==None:
            return None
        count = 0
        fast = head
        slow = head
        
        while fast != None:
            fast = fast.next
            count += 1
            if count == n+2 and count :
                slow = slow.next
                count -= 1
        
        if count == n:
            head = head.next
        elif slow == head and count != n+1:
            head = head.next
        else:
            slow.next = slow.next.next
        return head