# 142. Linked List Cycle II

# TC: O(n) where n is the number of nodes in the linked list
# SC: O(1) since we only use two pointers regardless of input size
# Did this code successfully run on Leetcode: Yes

# Approach :
# Find the starting point of a cycle in a linked list if one exists. 
# Phase 1: Detect if there is a cycle
    # Use two pointers: slow (moves 1 step at a time) and fast (moves 2 steps at a time)
    # If there's a cycle, the fast pointer will eventually catch up to the slow pointer
    # If there's no cycle, the fast pointer will reach the end of the list
# Phase 2: Find the start of the cycle
    # Once we detect a cycle, reset the slow pointer to the head
    # Keep the fast pointer at the meeting point
    # Move both pointers one step at a time
    # The point where they meet again is the start of the cycle

from typing import List, Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Edge case: empty list or single node list
        if not head or not head.next:
            return None
        
        # Initialize slow and fast pointers
        slow = head
        fast = head
        
        # Phase 1: Detect if there is a cycle
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            # If slow and fast meet, there is a cycle
            if slow == fast:
                # Phase 2: Find the start of the cycle
                slow = head
                while slow != fast:
                    slow = slow.next
                    fast = fast.next
                
                # Return the node where the cycle begins
                return slow
        
        # No cycle found
        return None
        