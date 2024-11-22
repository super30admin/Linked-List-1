# The code defines a removeNthFromEnd method to remove the nth node from the end of a singly linked list.
# The method uses two pointers to efficiently locate and remove the desired node in one pass.

# Initialization:
#   - A dummy node is created with value 0 and its next pointer set to the head of the list.
#       - This dummy node simplifies edge cases, such as removing the head node.
#   - 'left' is initialized to point to the dummy node.
#   - 'right' is initialized to point to the head of the list.

# Step 1: Move the Right Pointer
#   - Move 'right' forward by n steps to create a gap of n nodes between 'left' and 'right'.
#   - Decrement 'n' in each iteration until the gap is established.

# Step 2: Move Both Pointers
#   - Move both 'left' and 'right' one step forward at a time until 'right' reaches the end of the list.
#       - At this point, 'left' points to the node just before the nth node from the end.

# Step 3: Remove the Node
#   - Update the next pointer of 'left' to skip the nth node from the end:
#       - left.next = left.next.next
#   - This effectively removes the target node from the list.

# Final Result:
#   - Return dummy.next, which points to the head of the modified list.

# TC: O(n) - The list is traversed once to establish the gap and once to find the node to remove.
# SC: O(1) - The space complexity is constant as only a few pointers are used.


from typing import Optional


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        dummy = ListNode(0, head)
        left = dummy
        right = head

        while n > 0:
            right = right.next
            n -= 1
        
        while right:
            left = left.next
            right = right.next

        #delete
        left.next = left.next.next
        return dummy.next