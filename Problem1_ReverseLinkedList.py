# Time Complexity: O(n), where n = number of nodes in the list
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes

# Solution:
"""
1. Consider 2 pointers to point to previous and current node and a temp variable to store the next value.
2. Iterate through the list and for all nodes, change the next pointer direction to their previous node.
3. Return the head of the reversed list.
"""

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverse_list(self, head: ListNode) -> ListNode:
        if not head:
            return None

        prev = head
        curr = head.next

        # Point the next value of first node to None.
        head.next = None

        # For all nodes, change the next pointer direction to their previous node.
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev
