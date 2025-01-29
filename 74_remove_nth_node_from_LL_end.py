# Time complexity - O(n)
# Space complexity - O(1)

# Approach - Maintain a count, keep moving fast to next till it goes up to n. Then you keep moving slow
# and fast till fast becomes None, and then simply remove the slow's next node.
# Note: Have a dummy node before the LL's head.

from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None:
            return None
        
        dummy = ListNode(-1)
        dummy.next = head
        count = 0
        slow = dummy
        fast = dummy

        while count <= n:
            fast = fast.next
            count += 1
        
        while fast != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next

        return dummy.next