"""
Approach1: Find the length of LL, and remove nth node. TC: O(2n). one pass for length and second for removing

Approach2: move the fast pointer n times to maintain the n nodes difference between slow and fast.
TC: O(n), SC: O(1)
"""
from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        if not head:
            return head
        count = 0
        dummy = ListNode(-1)  # what if want to remove n = len(LL) node, to avoid this edge case, dummy is needed.
        dummy.next = head
        slow = dummy
        fast = dummy
        while fast and count <= n:  # make the difference between them as n
            fast = fast.next
            count += 1

        while fast:  # move one step for both fast and slow
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next  # remove the node

        return dummy.next  # return updated the node
