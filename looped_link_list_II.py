# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

# SC : O(1)
# TC : O(n)

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        slow = head 
        fast = head 
        
        while(slow and fast and fast.next): # to find loop fast runner in track logic
            fast = fast.next.next
            slow = slow.next
            if slow == fast:
                break
        
        if fast == None or fast.next == None: # so check condition if no loop
            return None
        
        # to find the loop point 
        start = head 
        while (True): # both ptrs move one step at a time 
            if start == fast:
                break
            start = start.next
            fast = fast.next
            
        return start
            
        
        
        