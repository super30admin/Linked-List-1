"""
time = o(n)
space = o(1)
we maintain slow and fast pointers and find if there is a cycle in the linked list, if there is a cycle slow and fast meet at a node.
we then start from head with a new pointer and then move slow and new pointer one node at a time, till they meet and they will meet at the start of the cycle
the algorithm behind this is floyd's tortoise algorithm
"""
from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        fast = slow = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow==fast:
                break
        if not fast or not fast.next:
            return None
        p1 = head
        while p1!=slow:
            p1=p1.next
            slow = slow.next
        return slow


        