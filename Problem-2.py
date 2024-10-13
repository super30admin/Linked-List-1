# Approach
# Maintain two pointers fast and slow and make fast pointer starts from the nth position difference and itertae the fast and slow by 1 pointer.
# When we reach the end in fast make slow will reach nth position so make slow.next = slow.next.next


# Complexities
#Time Complexity: O(n)
# Space Complexity: O(1)


# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head

        slow = dummy
        fast = dummy

        count = 0

        while count <= n:
            fast = fast.next
            count += 1

        while fast != None:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next

        return dummy.next

