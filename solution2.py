# time: O(n)
# space: O(1)


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        # if you wnat to remove nth node from the end- we need distance of n between prev and curr
        # then just send curr to last node and delte node next to prev
        if head is None or head.next is None:
            return None
        count = 0 
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        while count != n:
            fast = fast.next
            count += 1
        while fast and fast.next:
            slow = slow.next
            fast = fast.next
        temp = slow.next
        if slow.next:
            slow.next = slow.next.next
        if temp and temp.next:
            temp.next = None
        return dummy.next
