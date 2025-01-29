# Time complexity - O(n)
# Space complexity - O(1)

# Approach - Maintain a prev, curr, and next pointer. Till next is not None, assign curr.next to prev
# and move all three pointers to the next one. Make final curr.next to prev.

from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head
        prev = None
        curr = head
        fast = curr.next

        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr