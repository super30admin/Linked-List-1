# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Approach:
# Use Floyd's Cycle Detection Algorithm (Tortoise and Hare approach). Use two pointers: slow and fast.
# First, detect if a cycle exists by moving slow one step and fast two steps until they meet. If no cycle, return None.
# If a cycle exists, reset one pointer to the head and move both one step at a time until they meet again; this meeting point is the start of the cycle.

# Time Complexity: O(n), where n is the number of nodes in the list.
# Space Complexity: O(1), as no additional space is used.
# Did this code successfully run on Leetcode: Yes.
# Any problem you faced while coding this: No.

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Initialize two pointers, slow and fast
        slow, fast = head, head
        
        # Detect if a cycle exists
        while fast and fast.next:
            slow = slow.next       # Move slow pointer one step
            fast = fast.next.next  # Move fast pointer two steps
            if slow == fast:       # If slow and fast meet, a cycle exists
                break
        else:
            # If no cycle is detected, return None
            return None
        
        # Reset one pointer to the head to find the cycle start
        slow = head
        while slow != fast:
            slow = slow.next       # Move both pointers one step
            fast = fast.next       # until they meet
        
        # The meeting point is the start of the cycle
        return slow
