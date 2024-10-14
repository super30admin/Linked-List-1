# T.C = O(L) S.C = O(1)
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
        if head is None:
            return None
        
        count = 0

        dummy = ListNode(-1)
        dummy.next = head

        slow = dummy
        fast = dummy

        while(count!=n):
            fast = fast.next
            count+=1

        while fast.next is not None:
            slow = slow.next
            fast = fast.next

        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        return dummy.next
        