# Created by Aashish Adhikari at 6:40 PM 1/18/2021

'''
Time Complexity:
O(n)

Space Complexity:
O(n) as we create a new node "nextnode" at each iteration.
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
        prev = None
        while head is not None:

            nextnode = head.next
            head.next = prev
            prev = head
            head = nextnode

        return prev


