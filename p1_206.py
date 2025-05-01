# 206. Reverse Linked List

# TC: O(n) where n is the length of the linked list - we traverse each node exactly once
# SC: O(1) - we only use a constant amount of extra space regardless of input size
# Did this code successfully run on Leetcode: Yes

# Approach Explanation:
# The key insight is that we need to change the direction of the next pointers for each node.
# We use three pointers: prev, curr, and temp
# Initially, prev starts as None (since the first node in reversed list points to None)
# We iterate through the list with curr
# For each node:
    # Save the next node (temp = curr.next) before changing the pointer
    # Reverse the pointer (curr.next = prev)
    # Move prev to current node (prev = curr)
    # Move curr to next node (curr = temp)
# When we exit the loop (curr becomes None), prev points to the new head
# The solution uses an iterative approach with constant space complexity. The time complexity is O(n) because we visit each node exactly once.


from typing import List, Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Initialize two pointers
        prev = None
        curr = head
        
        # Iterate through the list
        while curr:
            # Store next node before we change curr.next
            temp = curr.next
            # Reverse the pointer
            curr.next = prev
            # Move prev and curr one step forward
            prev = curr
            curr = temp
        
        # Return the new head (which is the last node of original list)
        return prev