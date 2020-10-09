# O(N) time and O(1) space where N is length of linked list

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head is None or head.next is None:
            return None
        p1 = head.next
        p2 = head.next.next
        while p1 != p2:
            if p1 is None or p2 is None or p2.next is None:
                return None
            p1 = p1.next
            p2 = p2.next.next
        p1 = head
        while p1 != p2:
            p1 = p1.next
            p2 = p2.next
        return p2



        