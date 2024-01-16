""" Explanation: To execute this, we would simple need two pointers, one that can store the prev node
    of the Linked List, and one that can store the current node of the Linked List. At the beginning,
    the current node is the head node and prev node is set to null since there is no node before the
    head node. Then we simply iterate through the LinkedList and initiate another point to take care
    of the next node. Lasltly, we used the three pointers to swap the values.
    Time Complexcity: O(n)
    Space Complexcity: O(1)
    Code Passed all TC's on LC: Yes
"""


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

        # Initialize prev pointer as NULL...
        prev = None
        # Initialize the curr pointer as the head...
        curr = head
        # Run a loop till curr points to NULL...
        while curr:
            # Initialize next pointer as the next pointer of curr...
            next = curr.next
            # Now assign the prev pointer to curr’s next pointer.
            curr.next = prev
            # Assign curr to prev, next to curr...
            prev = curr
            curr = next
        return prev  