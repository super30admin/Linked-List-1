# Time Complexity : O(2n) two passes through the linked list
# Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
# Three line explanation of solution in plain english:
"""1. TThe solution uses two passes where first we count the number of nodes for base case check if the n and count are same.
2. We iterate until the node to be removed i.e nth node from end of the linked list.
3. Disconnect from the cur node and the node to be removed."""
# Definition for singly-linked list.
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        # First count the number of nodes in the given linked list
        count = 0
        cur = head
        while cur:
            count += 1
            cur = cur.next

        # If we need to remove the head node
        if n == count:
            return head.next

        # Iterate until the node just before the node to remove
        cur = head
        pos=count-n-1
        for _ in range(pos):
            cur = cur.next

        # Remove the nth node from end by disconnecting it
        cur.next = cur.next.next

        return head
       