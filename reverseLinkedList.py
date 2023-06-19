# Time Complexity: O(n)
# Space Complexity: O(1)

# Definition for singly-linked list.

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

from typing import Optional

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr:
            nx = curr.next
            curr.next = prev
            prev = curr
            curr = nx
        return prev