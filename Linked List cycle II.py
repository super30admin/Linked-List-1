class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        s=head
        f=head

        while f and f.next:
            s=s.next
            f=f.next.next
            if s==f:
                break
        else:
            return None
        s=head
        while s!=f:
            s=s.next
            f=f.next
        return s