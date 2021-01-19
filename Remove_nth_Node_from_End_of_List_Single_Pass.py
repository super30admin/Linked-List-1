# Created by Aashish Adhikari at 9:41 PM 1/18/2021

'''
Time Complexity:
O(n) + O( l - n) = O(l)

Space Complexity:
O(1) since we are creating only one new node regardless of the length of the linked list.
'''


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
        ######################################################

        # edge case
        if head is None or head.next is None:
            return None

        ######################################################

        dummy = ListNode(-1, head)
        ctr = 0
        p2 = dummy
        while ctr < n:
            p2 = p2.next
            ctr += 1
        ######################################################

        p1 = dummy
        while p2.next is not None:

            p1 = p1.next
            p2 = p2.next

        p1.next = p1.next.next


        return dummy.next

