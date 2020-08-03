class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head==None or head.next==None:
            return head
        curr=head
        prev=self.reverseList(head.next)
        head.next.next=head
        head.next=None
        return prev
#Time-Complexity: O(N)
#Space-Complexity: O(N)