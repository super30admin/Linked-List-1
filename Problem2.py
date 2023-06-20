# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        Time Complexity: O(n) n --> number of nodes in the linked list.
        Space Complexity: O(1)
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if head is None:
            return None

        # Create a dummy node to handle the edge case of removing the first node
        dummy = ListNode(-1)
        dummy.next = head

        # Initialize slow and fast pointers
        slow = dummy
        fast = dummy
        count = 0

        # Move the fast pointer n nodes ahead
        while count < n:
            fast = fast.next
            count += 1

        # Move both slow and fast pointers until fast reaches the end of the list
        while fast.next is not None:
            slow = slow.next
            fast = fast.next

        # Remove the nth node from the end
        slow.next = slow.next.next

        # Return the updated list (excluding the removed node)
        return dummy.next
