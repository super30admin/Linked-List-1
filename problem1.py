# TC: O(n)
# SC: O(n)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #base
        if head==None or head.next==None:
            return head
        #logic
        reversedNode=self.reverseList(head.next)

        head.next.next=head
        head.next=None

        return reversedNode