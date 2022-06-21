# T O(n) S: O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        dummy = ListNode(-1, head)
        slow = dummy
        fast = dummy
        if head == None:
            return head

        count = 0
        while count <= n:
            fast = fast.next
            count += 1

        while (fast != None):
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        return dummy.next




