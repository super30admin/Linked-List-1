# -*- coding: utf-8 -*-
"""
TC : O(N) as we traverse through the list 
SC : O(1) as no extra space used
"""

# Definition for singly-linked list.
class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        #initialize a dummy node and place it before head of the list
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        
        count = 0
        #Move the fast pointer ahead
        while count <= n:
            fast = fast.next
            count += 1
        
        #travrse through the list till fast reach the end
        
        while fast is not None:
            slow = slow.next
            fast = fast.next
        
        #move the slow pointer's next to 2 indices ahaed
        slow.next = slow.next.next
        
        #return the head of the mutated list
        return dummy.next