# Iterative
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def reverseList(self, head):
        """
        Time complexity: O(n), where n is the number of nodes in the linked list.
        Space complexity: O(1).
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head

        prev = None  # Initialize the previous node
        curr = head  # Initialize the current node
        fast = head.next  # Initialize the next node

        while fast is not None:
            curr.next = prev  # Reverse the pointer of the current node to the previous node
            prev = curr  # Move the previous node pointer to the current node
            curr = fast  # Move the current node pointer to the next node
            fast = fast.next  # Move the next node pointer to the following node

        curr.next = prev  # Reverse the pointer of the last node to the previous node
        return curr  # Return the new head node
