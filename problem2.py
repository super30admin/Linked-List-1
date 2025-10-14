# Time Complexity : O(N)
# (We traverse the linked list once with the two-pointer approach.)
#
# Space Complexity : O(1)
# (We only use two pointers and a few variables — no extra data structures.)
#
# Did this code successfully run on Leetcode : Yes
#
# Any problem you faced while coding this :
# Remembering to use a dummy node helps handle cases where the head itself needs to be removed
# without writing separate conditional logic.

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # Create a dummy node that points to the head of the list.
        # This simplifies edge cases (e.g., removing the head node itself).
        dummy = ListNode(-1)
        dummy.next = head

        # Initialize two pointers, both starting at the dummy node.
        slow = dummy
        fast = dummy

        # Step 1: Move the 'fast' pointer n+1 steps ahead
        # This creates a gap of n nodes between 'slow' and 'fast'.
        count = 0
        while count <= n:
            fast = fast.next
            count += 1

        # Step 2: Move both 'fast' and 'slow' one step at a time
        # until 'fast' reaches the end of the list.
        # At that point, 'slow' will be just before the node we need to remove.
        while fast is not None:
            fast = fast.next
            slow = slow.next

        # Step 3: Remove the nth node from the end.
        # 'slow.next' points to the node to be removed.
        temp = slow.next
        slow.next = slow.next.next  # Bypass the target node.
        temp.next = None            # Disconnect the removed node (optional cleanup).

        # Step 4: Return the new head of the list.
        # 'dummy.next' points to the actual head, even if the original head was removed.
        return dummy.next
