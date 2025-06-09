# Time Complexity : O(n), where n is the number of nodes in the linked list
# Space Complexity : O(n) for recursion stack in the recursive solution (worst case)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No

from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    
    # Recursive Approach
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head

        new_head = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return new_head

    # -------------------------------------------------------
    # Iterative Approach
    # Time Complexity : O(n)
    # Space Complexity : O(1)

        # curr = head
        # prev = None
        # while curr:
        #     temp = curr.next
        #     curr.next = prev
        #     prev = curr
        #     curr = temp
        # return prev
