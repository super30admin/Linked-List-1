# Recursive
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def reverseList(self, head):
        """
        Recursive solution not optimum
        Time complexity: O(n)
        Space complexity: O(n)
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head

        # Recursively reverse the remaining list
        reversed_head = self.reverseList(head.next)

        head.next.next = head  # Point the next node's next pointer to the current node
        head.next = None  # Set the current node's next pointer to None

        return reversed_head
