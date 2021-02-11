# O(N) TIME AND O(1) SPACE WHERE N IS LEN(LINKED LIST)
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        p1 = None
        p2 = head
        while p2 is not None:
            p3 = p2.next
            p2.next = p1
            p1 = p2
            p2 = p3
        return p1
        