class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        dummy=ListNode(0)
        dummy.next=head
        s=dummy
        f=dummy
        count=0
        while count<=n:
            f=f.next
            count=count+1
        
        while f:
            s=s.next
            f=f.next
        s.next=s.next.next
        return dummy.next