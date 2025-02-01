# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# time omplexity O(n)
# space complexity O(1)
from typing import Optional


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]: # type: ignore
        if head == None or head.next == None:
            return head
        prev = None
        curr = head
        f  = curr.next
        while f != None:
            curr.next = prev
            prev = curr
            curr = f
            f = f.next
        curr.next = prev

        return curr
        