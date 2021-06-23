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
        :SC:O(1)
        :TC:O(n)
        """
        cur, prev = head, None
        while cur:
            cur.next, prev, cur = prev, cur, cur.next
        return prev
    
#    # recursion

#     def reverseList(self, head):
#         return self._reverse(head)

#     def _reverse(self, node, prev=None):
#         if not node:
#             return prev
#         n = node.next
#         node.next = prev
#         return self._reverse(n, node)
