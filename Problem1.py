"""
TC: O(N) {we iterate through the every element of the linked list once}
SC: O(1) {we don't use any extra space}

Approach:

Initialize a prev pointer as Null/None and a curr pointer at the head. Iterate till the curr is not None. At every iteration,
swap the next pointer of curr to prev, update prev to curr and curr to curr.next (store curr.next to a temp at first).
At the end, the pointer at prev will give us the reversed linked list.

The problem ran successfully on LeetCode.
"""


from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None

        curr = head

        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        
        return prev