# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        cur = head

        while n:
            cur = cur.next
            n -= 1
        
        if not cur:
            return head.next

        c1 = head
        while cur.next:
            c1 = c1.next
            cur = cur.next

        c1.next = c1.next.next

        return head
