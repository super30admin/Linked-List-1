"""
Approach:
Flyods cycle detection algorithm can be used. fast pointer covers 2x the nodes covered by slow pointer at the node where
they meet. So we can start p1 from the head again and move the p2 and p1 1 step each. they meet again at the start of
the cycle.

TC: O(n)
SC: O(1)

"""
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head :
            return head

        s = head
        f = head
        while f:
            f = f.next
            if f:
                f = f.next
                s = s.next
            else: return None
            if f == s:
                s = head
                break

        if s != head: return None
        while s != f:
            f = f.next
            s = s.next

        return s