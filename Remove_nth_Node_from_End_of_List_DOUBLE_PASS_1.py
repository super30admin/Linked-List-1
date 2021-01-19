# Created by Aashish Adhikari at 7:40 PM 1/18/2021


'''
Time Complexity:
O(l) + O(l) ~ O(l)

Space Complexity:
O(l) + O(l) ~ O(l) since we are creating a new node at each iteration.
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

        ########################################################
        # Reverse the linked list.
        prev = None

        while head is not None:

            nextnode = head.next
            head.next = prev
            prev = head
            head = nextnode

        ########################################################
        # The linked list is reverse, prev is the new head.
        head = prev

        ########################################################
        # Reverse again but remove the unwanted node this time
        ctr = 1
        prev = None

        # edge case, when the first element is the one to be removed.
        if n == 1:
            head = head.next
        while head is not None:

            nextnode = head.next if ctr != n-1 else head.next.next
            head.next = prev
            prev = head
            head = nextnode

            ctr += 1

        return prev




