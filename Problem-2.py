"""
Approach: Use two pointers and maintain n distance between them. When the first pointer reaches the end. The second
pointer will at a position where the node after the second pointer can be skipped.

TC: O(n)
SC: O(1)
"""
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        p1 = head
        p2 = head

        for _ in range(n):
            p1 = p1.next

        if not p1:
            return head.next

        while p1.next:
            p1 = p1.next
            p2 = p2.next


        p2.next = p2.next.next
        return head