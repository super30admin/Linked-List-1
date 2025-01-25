"""
problem 2: Remove Nth Node From End of List
TC: O(N)
SC: O(1)
Approach: Two pointer approach
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return

        dummy = ListNode(-1)
        dummy.next = head
        cnt = 0
        slow = dummy
        fast = dummy

        while cnt <= n:
            fast = fast.next
            cnt += 1

        while fast:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next

        return dummy.next
