# Time Complexity : O(N) where N is the number of nodes in the linked list
# Space Complexity : O(1) as we only use a constant amount of extra space for pointers
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach:
# I am using Floyd's Cycle Detection Algorithm (Tortoise and Hare) to detect the cycle in the linked list.
# I initialize two pointers, slow and fast, both starting at the head of the list.
# I move the slow pointer one step at a time and the fast pointer two steps at a time.
# If there is a cycle, the two pointers will eventually meet inside the cycle.
# Once they meet, I reset the fast pointer to the head of the list and keep the slow pointer at the meeting point.
# I then move both pointers one step at a time until they meet again.
# The node where they meet is the starting point of the cycle, which I return.
# If there is no cycle, I return None.

from typing import Optional
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                # return fast
                break
        if not fast or  not fast.next:
            return None
        fast = head
        while fast != slow:
            slow = slow.next
            fast = fast.next
        return slow
        

        # return -1
        