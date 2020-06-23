#LC 19 - Remove Nth Node From End of List
#Time Complexity - O(n)
#Space Complexity - O(1)
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy = ListNode('#')
        dummy.next = head
        fast = dummy
        slow = dummy
        cnt = 0
        while cnt <= n:
            fast = fast.next
            cnt = cnt + 1
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next