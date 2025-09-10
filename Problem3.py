"""
TC: O(N) {in the worst case we traverse the entire list with the slow and fast pointers}
SC: O(1) {we only use a few pointer variables}

Approach:

We apply Floyd's Cycle Detection (Tortoise and Hare) algorithm.
Initialize slow and fast pointers at the head. Move slow by one step and fast by two steps.
If they ever meet, a cycle exists in the list.
If fast reaches None, then no cycle exists.
Once a cycle is detected, reset slow to head and keep fast at the meeting point.
Move both slow and fast one step at a time. The point where they meet again is the node where the cycle begins.
Return that node.

The problem ran successfully on LeetCode.
"""


from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow, fast = head, head
        cycle = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                cycle = True
                break
        
        if not cycle:
            return None
        
        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next
        
        return slow