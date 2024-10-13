"""
Approach1: use hset. Traverse LL and storing and checking if LL node is present in hset. If yes, there is cycle
else no. Once cycle detected find the head.TC: O(n) SC: O(n)
Approach2: check if cycle exists in the LL. If yes, take one pointer from start of LL, say current, and move the meeting
point of head and slow pointer by 1 with the current pointer. Wherever, the current pointer meets it is the start of cycle
TC: O(n) detect cycle and O(n) to find head. SC: O(n)
"""
from typing import Optional


# Definition for singly-linked list.

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        # first detect cycle
        slow = head
        fast = head
        while fast and fast.next:  # fast for even length and fast.next for odd length
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break
        if not fast or not fast.next: # check if cycle exists
            return None

        curr = head
        while curr != slow:
            curr = curr.next
            slow = slow.next

        return curr
