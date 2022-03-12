# Time Complexity - O(n)
# Space Complexity - O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        s = dummy
        f = dummy
        for i in range(n):
            f = f.next
        while f.next!=None:
            s = s.next
            f = f.next
        s.next = s.next.next
        return dummy.next
