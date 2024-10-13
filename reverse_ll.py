"""
By storing the next element in the list and changing the pointer of the current element to previous, LL is revered.
Todo: using recursion
"""
from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList_approach1(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if not head:
            return head

        prev = None
        curr = head
        while (curr):
            temp = curr.next  # successor is tracked inside the loop
            curr.next = prev
            prev = curr
            curr = temp

        return prev

    def reverseList_approach2(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        temp = curr.next  # successor is defined outside the loop
        while temp:
            curr.next = prev
            prev = curr
            curr = temp
            temp = temp.next

        curr.next = prev
        return curr
