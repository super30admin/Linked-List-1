# Time Complexity :O(n)
# Space Complexity :O(n)
# Leet Code: Yes

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return head

        if head.next is None:
            return head

        rev = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return rev