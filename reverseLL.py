# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


# Iterative:
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        p, c = None, head

        while c:
            t = c.next
            c.next = p
            p = c
            c = t

        return p
        # T: O(n), S: O(1)


# Recursive:
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        newHead = head
        if head.next:
            newHead = self.reverseList(head.next)
            head.next.next = head
        head.next = None
        return newHead
        # T: O(n), S: O(n)
