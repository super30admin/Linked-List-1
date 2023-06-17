# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Create a dummy node, move the fast pointer n+1 steps ahead. We do this, then move both pointers together until the fast pointer becomes null.
# In this state, slow pointer will be at the correct position for the removal.
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        if not head.next:
            return None
        
        dummy = ListNode(-1, head)
        slow, fast = dummy, dummy
        for _ in range(n+1):
            fast = fast.next
        while fast:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        return dummy.next