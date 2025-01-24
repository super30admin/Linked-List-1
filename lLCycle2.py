class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Check whether a cycle exists
        s, f = head, head
        hasCycle = False
        while f and f.next:
            s = s.next
            f = f.next.next
            if s == f:
                hasCycle = True
                break
        if not hasCycle:
            return None
        # Reset f to head
        f = head
        while f != s:
            # Increment s and f till they meet
            s = s.next
            f = f.next
        return f
        # T: O(n), S: O(1)
