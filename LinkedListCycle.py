'''
TC: O(n)
SC: O(1)
'''
# Definition for singly-linked list.
from typing import Optional

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        s,f = head, head
        while f is not None and f.next is not None:
            s = s.next
            f = f.next.next
            if s == f:
                return True
        return False