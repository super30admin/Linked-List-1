# https://leetcode.com/problems/linked-list-cycle-ii/

# Time Complexity : O(N) where N is number of nodes in the linkedlist.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach.

# Approach : We start with two pointer approach. We have fast and a slow pointer. Fast pointer moves two steps at a time
# Slow pointer moves one step at a time. If fast pointer becomes null then there is no cycle.
# If slow and fast meets then there is a cycle. We then reset one of the pointer to head and move both the pointers
# one step at a time until they meet. Then we return that position

from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        slow, fast = head, head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break

        if fast is None or fast.next is None:
            return None

        fast = head

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow
