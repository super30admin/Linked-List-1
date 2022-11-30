from typing import Optional
# Time Complexity : O(n), where n is number of elements in the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing Specific

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow=head
        fast=head
        cycle_occured=False
        #Here idea is very simple keep two pointers slow, fast Where slow moves at 1X and fast moves at 2X speed. 
        '''We are checking the whether fast has reached the end of the linked list, we have included "fast.next" because there can be situation where we may reach one element before None'''
        while(fast!=None and fast.next!=None):
            slow=slow.next#This is taking one step
            fast=fast.next.next#This is taking two steps
            
            if(slow==fast):
                cycle_occured=True
                break
            else:
                continue                    
        if(cycle_occured):
            #This is case when the cycle has been detected
            #Here we can move either of fast or slow to head
            fast=head
            while(fast!=slow):
                fast=fast.next
                slow=slow.next
            return fast
        else:
            #This is when cycle is not detected
            return None