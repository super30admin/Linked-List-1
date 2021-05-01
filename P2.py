# -*- coding: utf-8 -*-
"""
Created on Fri Apr 30 23:02:13 2021

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
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        first=head
        second=head
        i=1
        while(i<n+1):
            if first.next != None:
                first = first.next
            else: 
                return head.next
            i+=1
        while(first.next!=None):
            first=first.next
            second=second.next
        second.next=second.next.next
        return head
    