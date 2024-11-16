# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Approach:
# Use two pointers: `first` and `second`. Move `first` n steps ahead, and then move both pointers together until `first` reaches the end.
# This way, the `second` pointer will be just before the node to be removed. Adjust the links to skip the target node.
# Edge case: If the node to be removed is the head, handle it by returning `head.next`.

# Time Complexity: O(sz), where sz is the number of nodes in the list
# Space Complexity: O(1), as no additional space is used
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # Create a dummy node to handle edge cases, such as removing the head
        dummy = ListNode(0, head)
        first = dummy  # Initialize the `first` pointer at the dummy node
        second = dummy  # Initialize the `second` pointer at the dummy node
        
        # Move `first` n+1 steps ahead so there's a gap of n nodes between `first` and `second`
        for _ in range(n + 1):
            first = first.next
        
        # Move both pointers together until `first` reaches the end
        while first:
            first = first.next
            second = second.next
        
        # `second` is now just before the node to be removed
        second.next = second.next.next  # Remove the target node by skipping it
        
        # Return the head of the modified list
        return dummy.next
