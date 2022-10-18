'''
Time Complexity: O(n)
Space Complexity: O(1)
'''
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
        if(not head):
            return head
        p = None
        c = head
        f = head.next
        while(f):
            c.next = p
            p = c
            c = f
            f = f.next
        c.next = p
        return c
