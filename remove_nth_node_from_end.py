# O(N) time and O(1) Space where N is the length of linkedlist
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head: ListNode, k: int) -> ListNode:
        dummy = ListNode()
        dummy.next = head
        p1 = dummy
        p2 = dummy
        count = 0
        while count <= k: # k + 1 steps
            p2 = p2.next
            count += 1
        while p2 is not None:
            p1 = p1.next
            p2 = p2.next
        p1.next = p1.next.next

        return dummy.next


