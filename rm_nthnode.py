#TC = O(L)
#SC = O(1)
#Run on LC

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.value = value
        self.next = None


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        fast = head
        slow = head

        for i in range(n):
            fast = fast.next

        if fast is None:
            return head.next

        while (fast.next):
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next

        return head







