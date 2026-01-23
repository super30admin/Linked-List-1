"""
space - o(1)
time - o(n)
we keep a dummy node and use two pointers, move one pointer to nth position from head (with head as 1) and once this happens, we move both pointers one node
at a time till second pointer reaches the last node, at this point we remove the node next to the first pointer.
"""
from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head
        p1 = head
        p2 = dummy
        for _ in range(1,n):
            p1 = p1.next
        while p1 and p1.next:
            p1 = p1.next
            p2 = p2.next
        if p2.next:
            p2.next = p2.next.next
        return dummy.next
        