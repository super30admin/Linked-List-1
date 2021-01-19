# Created by Aashish Adhikari at 6:40 PM 1/18/2021

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        last = None
        while head is not None:

            node = ListNode(val = head.val, next = last)

            last = node

            head = head.next

        return last
