# Time Complexity: O(n)
# Space Complexity: O(1) 

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # Dummy node added before head to removing the head itself if needed
        dummy = ListNode(0, head)
        slow = fast = dummy

        # Move fast by n+1 steps to get gap of n between fast and slow
        for _ in range(n + 1):
            fast = fast.next

        # Move both pointers until fast reaches the end
        while fast:
            fast = fast.next
            slow = slow.next

        # Now slow is right before the node to remove
        slow.next = slow.next.next

        # Return new head
        return dummy.next
