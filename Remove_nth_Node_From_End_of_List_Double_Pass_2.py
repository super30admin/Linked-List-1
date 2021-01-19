# Created by Aashish Adhikari at 9:20 PM 1/18/2021

'''
Time Complexity:
O(l) + O( l - n) ~ O(l)

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


        # edge case
        if leng == 1:
            return None # because the only possibility would be n == 1 for this case.


        #########################################################
        # find the length of the linked list first
        leng = 0
        node = head
        while node is not None:
            leng += 1
            node = node.next

        #########################################################
        # skip the (leng - n)th node from the linked list

        ctr = -1

        dummy_node = ListNode(-1, head)

        node = dummy_node

        from_end = leng - n

        while from_end > 0:
            from_end -= 1
            node = node.next


        node.next = node.next.next

        return dummy_node.next