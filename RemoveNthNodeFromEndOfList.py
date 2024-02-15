'''
TC: O(n)
SC: O(1)
'''
# Definition for singly-linked list.
from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1,head)
        s,f = dummy, dummy.next
        for i in range(n):
            f = f.next
        while f:
            s = s.next
            f = f.next
        s.next = s.next.next
        return dummy.next