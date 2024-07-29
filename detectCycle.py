# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    """
    Time Complexity: O(N)
    Space Complexity: O(1)
    """
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # If the list is empty, there's no cycle.
        if head is None:
            return None

        slow = head  # Initialize slow pointer to the head of the list.
        fast = head  # Initialize fast pointer to the head of the list.
        hasCycle = False  # Flag to indicate if a cycle exists.

        # Move slow pointer one step and fast pointer two steps at a time.
        # If they meet, there is a cycle.
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True  # Cycle detected.
                break

        # If no cycle is detected, return None.
        if not hasCycle:
            return None

        # Reset fast pointer to the head of the list.
        fast = head

        # Move slow and fast pointers one step at a time until they meet.
        # The meeting point is the start of the cycle.
        while slow != fast:
            fast = fast.next
            slow = slow.next

        # Return the node where the cycle begins.
        return slow
