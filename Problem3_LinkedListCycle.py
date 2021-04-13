# Time Complexity: O(n), where n = number of nodes in the list
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes

# Solution:
"""
1. Using slow(1x) and fast(2x) pointers, get the intersecting node of the pointers.
2. If there is no intersecting node, it means there is no cycle. Hence, return None.
3. If not, use 2 pointers moving at same speed (one from head and other from intersecting node) to find the start of the cycle.
"""

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def detect_cycle(self, head: ListNode) -> ListNode:
        if not head:
           return None

        intersect_node = self.find_intersect(head)

        # If there is no intersecting node, there is no cycle. Hence, return None.
        if not intersect_node:
            return None

        # 2 pointers - one from head and other from intersecting node moving at same speed meets at the cycle start.
        p1 = head
        p2 = intersect_node

        while p1 != p2:
            p1 = p1.next
            p2 = p2.next

        return p1

    # Find the node at which slow and fast pointers intersect
    def find_intersect(self, head) -> ListNode:
        slow = fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                return slow

        return None