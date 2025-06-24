# Time Complexity : O(n)
# Space Complexity : O(n) Auxiliary space for the recursive stack
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
# Three line explanation of solution in plain english:
"""1. The function uses recursion to reach the end of the linked list.
2. While the recursive stack unwinds, from the last node as head, we save the last node in the reverseNode.
3. Set the ordering of nodes to disconnect previous link and returns the new head node of the reversed list."""
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        reverseNode=None
        # Recursive helper function to reverse the list
        def reverse(head):
            # Base case: if head is None or only one node, return head if it reaches the end
            if not head or head.next is None:
                return head
            # Recurse to the end of the list
            reverseNode=reverse(head.next)
            # Reverse the pointer by disconnecting the current node from the next node
            head.next.next=head
            head.next=None
            # Return the new head of the reversed list
            return reverseNode
        return reverse(head)
        