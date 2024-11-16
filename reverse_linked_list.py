# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Approach:
# Use two pointers to reverse the list in-place. Initialize a `prev` pointer to None and iterate through the list,
# reversing the direction of each node's `next` pointer to point to the previous node.
# Return `prev`, which will point to the new head of the reversed list.

# Time Complexity: O(n), where n is the number of nodes in the list
# Space Complexity: O(1), as the reversal is done in-place
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None  # Initialize previous pointer as None
        current = head  # Start with the head of the list
        
        while current:  # Traverse the list
            next_node = current.next  # Store the next node
            current.next = prev  # Reverse the link
            prev = current  # Move the `prev` pointer forward
            current = next_node  # Move the `current` pointer forward
        
        return prev  # `prev` now points to the new head of the reversed list
