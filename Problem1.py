'''
Time Complexity: O(n)
Space Complexity: O(1)
Run on Leetcode: YES
'''
from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # null case
        if head == None:
            return None
        prev = None
        curr = head
        while curr != None:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev