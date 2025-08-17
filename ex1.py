# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head

        # Iterate through the list and reverse links
        while curr:
            tail = curr.next   # Store next node
            curr.next = prev   # Reverse current node's pointer
            prev = curr        # Move prev to current
            curr = tail        # Move to next node

        # prev will point to the new head of the reversed list
        return prev
