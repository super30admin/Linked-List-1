# TC: O(n)
# SC: O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        d=ListNode(-1, head)
        head=d
        count=0
        slow=fast=head
        while (count<=n):
            fast=fast.next
            count+=1
        
        while fast!=None:
            fast=fast.next
            slow=slow.next
        
        temp=slow.next.next
        slow.next.next=None
        slow.next=temp
    
        return head.next