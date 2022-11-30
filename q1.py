from typing import Optional
# Time Complexity : O(n), Where n is number of elements in the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing specific 

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:    
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if(head==None):
            #Edge Case
            return None
        else:
            #We will use three pointer approach to solve the problem
            prev,pres,fut=None,head,head.next
            while(fut!=None):
                pres.next=prev#Here we just changing the links in the reverse direction
                prev=pres
                pres=fut
                fut=fut.next
            pres.next=prev#Here we adjusting the link at the last node in the linked list
            
            return pres