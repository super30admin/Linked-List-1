# TC = O(N)
# SC = O(1)
#LEETCODE = YES
# PROBLEMS = NO

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
from typing import Optional

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        # tmp = head.next
        
        while(curr != None):
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
        
        return prev