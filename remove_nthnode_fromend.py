# O(N) TIME AND O(1) SPACE
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode()
        dummy.next = head
        p1 = dummy
        p2 = dummy
        length = 1
        while length <= n:
            p2 = p2.next
            length += 1
        while p2.next is not None:
            p1 = p1.next
            p2 = p2.next
        p1.next = p1.next.next
        return dummy.next