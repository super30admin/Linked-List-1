#  Time Complexity : O(N)
#  Space Complexity :O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this :


#  Your code here along with comments explaining your approach
        # fast=curr.next
        # curr.next=prev
        # prev=curr
        # curr=fast


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # fast=curr.next
        # curr.next=prev
        # prev=curr
        # curr=fast

        prev=None
        curr=head
        fast=head
        while(fast!=None):
            fast=curr.next
            curr.next=prev
            prev=curr
            curr=fast
        return prev
        
