# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        l, r = dummy, head

        # Increment r
        while n > 0 and r:
            r = r.next
            n -= 1

        # Increment l and r till r is not null
        while r:
            l = l.next
            r = r.next

        # Update l.next
        l.next = l.next.next
        return dummy.next
        # T: O(n), S: O(1)
