# Time Complexity : O(n), where n is the number of nodes in the linked list
# Space Complexity : O(1), since no extra space is used (Floyd’s Cycle Detection)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

from collections import Optional

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Floyd's Tortoise and Hare algorithm
        if not head or not head.next:
            return None

        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break
        else:
            return None  # No cycle found

        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow

    # -------------------------------------------------------
    # HashSet Approach
    # Time Complexity : O(n)
    # Space Complexity : O(n) for storing visited nodes

        # visited = set()
        # node = head
        # while node:
        #     if node in visited:
        #         return node
        #     visited.add(node)
        #     node = node.next
        # return None
