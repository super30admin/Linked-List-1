# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

# TC : O(n)
# SC : O(1)

from typing import Optional


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head 
        
        p1 = dummy 
        p2 = dummy 
        
        k = n
        while( k and p2 != None and p2.next != None): # move this N steps ahead
            p2 = p2.next
            k = k - 1
        
        while( (p1 != None) and (p2!= None) and (p2.next != None) ): # move these two one step at a time
            p1 = p1.next
            p2 = p2.next
        
        p1.next = p1.next.next
        
        return dummy.next