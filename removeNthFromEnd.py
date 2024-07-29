# Definition for a singly-linked list node.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    """
    Time Complexity: O(n)
    Space Complexity: O(1)
    """
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # If the head is None, return None since there's nothing to remove.
        if head is None:
            return head

        # Create a dummy node which points to the head of the list.
        # This helps to handle edge cases where the node to be deleted is the head node.
        dummy = ListNode(-1)
        dummy.next = head

        # Initialize two pointers, slow and fast, both pointing to the dummy node.
        slow = dummy
        fast = dummy

        # Move the fast pointer n+1 steps ahead, so that there is a gap of n nodes between slow and fast.
        for _ in range(n + 1):
            fast = fast.next

        # Move both pointers one step at a time until fast reaches the end of the list.
        # At this point, slow will be just before the node to be deleted.
        while fast is not None:
            slow = slow.next
            fast = fast.next

        # Skip the nth node from the end.
        slow.next = slow.next.next

        # Return the head of the modified list.
        return dummy.next
