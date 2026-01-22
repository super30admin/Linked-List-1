# Time Complexity : O(n) where n is the number of nodes
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use Floyd's cycle detection algorithm with two pointers (slow and fast).
# First detect if cycle exists by checking if fast pointer meets slow pointer.
# If cycle exists, reset one pointer to head and move both at same speed until they meet at cycle start.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return None
        
        # Floyd's cycle detection
        slow = head
        fast = head
        
        # Detect cycle
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            # Cycle detected
            if slow == fast:
                # Find the start of cycle
                # Reset one pointer to head
                slow = head
                
                # Move both at same speed until they meet
                while slow != fast:
                    slow = slow.next
                    fast = fast.next
                
                return slow  # or fast, both point to cycle start
        
        return None  # No cycle
