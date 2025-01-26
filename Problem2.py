# Slow and fast pointer until the fast pointers moves away until the distance between them is N. Now we iterate both until fast goes out then slow.next = slow.next.next
# TC: O(N)
# SC: O(1)
# Yes this worked in leetcode

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return head
        dummy = ListNode(-1)
        dummy.next = head
        slow, fast = dummy, dummy
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next
