# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        slow = ListNode(-1)
        slow.next = head
        fast = head = slow
        count = 0

        while count < n:
            fast = fast.next
            count += 1

        while fast.next:
            slow = slow.next
            fast = fast.next

        temp = slow.next
        temp1 = temp.next
        temp.next = None
        slow.next = temp1

        return head.next