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
        i=0
        fast = head
        slow = head
        while i<n:
            fast = fast.next
            i+=1
        if not fast:
            return head.next
        else:
            while fast.next:
                slow = slow.next
                fast = fast.next
            slow.next = slow.next.next
        return head