# Definition for singly-linked list.
from typing import Optional
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

# TC : O(N)
# SC : O(1)

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return head
        
        prev = None 
        curr = head
        nextp = head.next
        
        
        while ( curr != None and curr.next != None):
            curr.next = prev  # first assign cur.next 
            prev = curr # now set prev to curr
            curr = nextp # curr becomes next ptr
            nextp = nextp.next # next ptr goes to next node
        curr.next = prev # this last step is because only this one step from above is needed rest are not
        
        return curr