# Time Complexity :O(n) 
# Space Complexity :O(n)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this : No
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
#         O(n)----tc
# O(n)---sc
        prev=None
        curr=head
        while curr:
            next_node=curr.next
            curr.next=prev
            prev=curr
            curr=next_node
        return prev