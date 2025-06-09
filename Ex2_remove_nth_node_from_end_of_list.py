# Time Complexity : O(L), where L is the length of the list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

from collections import Optional

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        # One-pass optimal solution using two pointers
        dummy = ListNode(0, head)  # Dummy node to handle edge cases easily
        slow = dummy
        fast = dummy

        # Move fast ahead by n+1 steps so there's a gap of n between fast and slow
        for _ in range(n + 1):
            fast = fast.next

        # Move both pointers until fast reaches the end
        while fast:
            slow = slow.next
            fast = fast.next

        # Now slow is just before the node to delete
        slow.next = slow.next.next

        return dummy.next

    # ------------------------------------------------------------------------
    # Two-pass approach (naive)
    # Time Complexity : O(L), two traversals
    # Space Complexity : O(1)

    #     length = 0
    #     temp = head
    #     while temp:
    #         length += 1
    #         temp = temp.next

    #     # Edge case: removing the head
    #     if length == n:
    #         return head.next

    #     temp = head
    #     for _ in range(length - n - 1):
    #         temp = temp.next

    #     if temp and temp.next:
    #         temp.next = temp.next.next

    #     return head
