# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        prev,curr = None, head

        while curr:
            nxtNode = curr.next
            curr.next = prev
            prev = curr
            curr = nxtNode
        return prev
        
