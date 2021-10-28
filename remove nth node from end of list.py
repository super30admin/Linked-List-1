# TC-O(n)
# SC-O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1, head)
        point1 = dummy
        point2 = dummy

        while (n > 0):
            point2 = point2.next
            n -= 1
        while (point2.next != None):
            point1 = point1.next
            point2 = point2.next
        point1.next = point1.next.next
        return dummy.next