# Created by Aashish Adhikari at 8:10 AM 1/19/2021

'''
Time Complexity:
O(l)

Space Complexity:
O(l)
'''

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """

        hs = set()


        while head is not None:

            if head not in hs:
                hs.add(head)
                head = head.next
            else:
                return head
        return None