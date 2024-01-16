""" Explanation: Two pointer approach. We iterate through the Linked List using two pointers such that
    the second pointer moves and compares the node at the slow pointer iteratively for every node.
    Then we remove that node and move the following nodes to previous positions.
    Time Complexcity: O(n)
    Space Complexcity: O(1)
    TC's passed on LC: Yes
"""


# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # two pointers starting at the head of the Linked List
        slow = fast = head

        # find the nth position of the Linked List
        for node in range(n):
            fast = fast.next

        if not fast:
            return head.next

        # then advance both fast and slow now they are nth postions apart
        # when fast gets to None, slow will be just before the item to be deleted
        while fast.next:
            slow = slow.next
            fast = fast.next
        # delete the node
        slow.next = slow.next.next
        return head


        