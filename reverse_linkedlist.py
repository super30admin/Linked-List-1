# This solution reverses a singly-linked list using an iterative approach.
# It maintains a `prev` pointer to build the reversed list while traversing the original list with `cur`.
# At each step, the current node’s `next` pointer is redirected to the previous node.

# Time Complexity: O(n), where n is the number of nodes in the linked list, since each node is visited once.
# Space Complexity: O(1), as the reversal is done in-place without using extra space.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev, cur = None, head

        while cur:
            temp = cur.next
            cur.next = prev
            prev = cur
            cur = temp
        return prev
