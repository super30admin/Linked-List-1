# Approach
# Maintain 2 pointers prev and curr make current.next to prev and maintain temp pointer to dont loose the curr.next


# Complexities
#Time Complexity: O(n)
# Space Complexity: O(1)


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
from typing import Optional


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr != None:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev