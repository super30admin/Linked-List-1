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
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        slow = head
        fast = head
        for _ in range(n):
            fast = fast.next
        if fast == None:
            return head.next
        while fast.next != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return head