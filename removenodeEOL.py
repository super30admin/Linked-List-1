"""
TC - O(N)
SC - O(1)
"""

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None:
            return None

        dummy = ListNode()

        dummy.next = head
        slow = dummy
        fast = dummy

        count = 0

        while count <= n:
            fast = fast.next
            count += 1

        while fast is not None:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        head = dummy.next

        return head
