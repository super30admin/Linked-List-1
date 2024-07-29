# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    """
    Time Complexity: O(N)
    Space Complexity: O(1)
    """
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # If the list is empty or has only one node, return the head as it is.
        if head is None or head.next is None:
            return head
        
        prev = None  # Initialize previous pointer to None.
        curr = head  # Initialize current pointer to the head of the list.
        fast = head.next  # Initialize fast pointer to the second node.
        
        # Traverse the list until the fast pointer reaches the end.
        while fast is not None:
            curr.next = prev  # Reverse the link.
            prev = curr  # Move previous pointer to the current node.
            curr = fast  # Move current pointer to the fast node.
            fast = fast.next  # Move fast pointer to the next node.
        
        # Finally, reverse the link for the last node.
        curr.next = prev
        
        # Return the new head of the reversed list.
        return curr
