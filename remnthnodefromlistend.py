# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: 'ListNode', n: int) -> 'ListNode':
        dummy = ListNode(-1)
        dummy.next = head

        slow = dummy
        fast = dummy

        count = 0
        while count < n:
            fast = fast.next
            count += 1

        while fast.next is not None:
            slow = slow.next
            fast = fast.next

        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        return dummy.next

 # TC - O(n)
 # SC - O(1)