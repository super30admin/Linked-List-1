# 19. Remove Nth Node From End of List

# TC: O(L) where L is the length of the linked list - we traverse the list at most twice
# SC: O(1) - we only use a constant amount of extra space regardless of input size
# Did this code successfully run on Leetcode: Yes

# Approach Explanation:
# We need to find a node's position from the end while only being able to traverse forward.
# The approach uses the two-pointer technique:
    # Create a dummy node that points to the head to handle edge cases
    # Initialize two pointers (first and second) at the dummy node
    # Move the first pointer n+1 steps ahead - this creates a gap of n+1 nodes between first and second
    # Move both pointers one step at a time until first reaches the end
    # At this point, second is pointing to the node just before the one we want to remove
    # Update second.next to skip the target node (second.next = second.next.next)
    # Return dummy.next as the new head
# This one-pass solution efficiently removes the nth node from the end while handling all edge cases, including removing the first node.

from typing import List, Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # Create a dummy node to handle edge cases (like removing the head)
        dummy = ListNode(0)
        dummy.next = head
        
        # Initialize two pointers
        first = dummy
        second = dummy
        
        # Move first pointer n+1 steps ahead
        for i in range(n + 1):
            first = first.next
            # If first becomes None before completing n+1 steps
            # This means n is equal to the length of the list
            if first is None and i < n:
                break
        
        # Move both pointers until first reaches the end
        while first:
            first = first.next
            second = second.next
        
        # Remove the nth node from the end
        second.next = second.next.next
        
        # Return the head of the modified list
        return dummy.next