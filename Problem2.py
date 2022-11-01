# Time Complexity - O(n)
# Space Complexity - O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        s = head
        f = head
        while n > 0:
            f = f.next
            n -= 1
        if not f:
            return head.next
        while f.next:
            s = s.next
            f = f.next
        s.next = s.next.next
        return head