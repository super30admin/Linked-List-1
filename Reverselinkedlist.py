# Time Complexity : O(N)
# Space Complexity : O{1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No



  def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev=None
        while(head):
            nxt=head.next
            head.next=prev
            prev=head
            head=nxt
        return prev