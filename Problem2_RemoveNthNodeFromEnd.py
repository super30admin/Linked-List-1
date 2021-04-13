# Time Complexity: O(n), where n = number of nodes in the list
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes

# Solution:
"""
1. Consider 2 pointers slow and fast, starting from the node before head.
2. Move the fast pointer until it is at 'n' distance from the slow pointer.
3. Then, move both slow and fast pointers until fast reaches the end and remove the nth node.
"""

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def remove_nth_node(self, head: ListNode, n: int) -> ListNode:
        if not head:
            return None

        prev = ListNode(-1)
        prev.next = head
        slow = fast = prev

        # Move the fast pointer at 'n' distance from slow pointer
        for i in range(n):
            fast = fast.next

        # Move both slow and fast pointers till end and remove the nth node from the end.
        while fast.next:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next

        return prev.next