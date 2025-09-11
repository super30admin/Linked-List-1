def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
    count=0
    slow=head
    fast=head
    while count<n:
        count+=1
        fast=fast.next
    if not fast:
        return slow.next
    while fast and fast.next:
        slow=slow.next 
        fast=fast.next
    temp=slow.next
    slow.next=slow.next.next
    temp.next=None
    return head
    