# Approach:
# Use two pointers (slow and fast), moving slow n+1 steps ahead to maintain a gap.
# Move both pointers until slow reaches the end, then remove the nth node from the end by updating fast.next.
# Time Complexity: O(n) (Single pass through the list).
# Space Complexity: (1) (Only a few extra pointers used).
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        slow, fast = dummy, dummy
        for i in range(n+1):
            slow = slow.next
        while slow:
            slow, fast = slow.next, fast.next
        fast.next = fast.next.next
        return dummy.next