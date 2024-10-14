# T.C = O(n) S.C = O(1)
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """

        if head is None:
            return None

        prev = None
        curr = head
        

        while(curr is not None):
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev
        