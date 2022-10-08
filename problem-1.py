# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
from typing import Optional
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseListIterative(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head
        prev = None
        
        while(curr):
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev
    
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]: #recursive
        if (not head) or (not head.next):
            return head
        
        p = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return p