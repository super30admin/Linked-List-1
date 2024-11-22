# The code defines a reverseList method to reverse a singly linked list in place.
# The method iterates through the list, reversing the direction of the links between nodes.

# Initialization:
#   - 'prev' is initialized to None, representing the new tail of the reversed list.
#   - 'curr' is initialized to the head of the original list, representing the current node being processed.

# Main Loop:
#   - While 'curr' is not None (i.e., there are nodes to process):
#       - Save the next node (curr.next) in a temporary variable 'temp' to preserve the link.
#       - Reverse the current node's pointer by setting curr.next to 'prev'.
#       - Move 'prev' forward to the current node (prev = curr).
#       - Move 'curr' forward to the next node stored in 'temp'.
#   - The loop continues until all nodes have been processed and the list is reversed.

# Final Result:
#   - After the loop, 'prev' points to the new head of the reversed list.
#   - The method returns 'prev', which is the head of the reversed list.

# TC: O(n) - Each node in the list is processed once, making the time complexity linear.
# SC: O(1) - The space complexity is constant, as the reversal is performed in place using a few pointers.


from typing import Optional


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev, curr = None, head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev