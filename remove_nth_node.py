# Time Complexity :O(n) 
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this : No
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
#         O(n)----TC
# O(1)----SC
#         Two pass solution
        dummy=ListNode(0,next=head)
        curr=head
        count=0
        prev=None
        while curr:
            count=count+1
            curr=curr.next  
        curr=dummy
        count=count-n
        while count>0:
            count=count-1
            curr=curr.next
        curr.next=curr.next.next
        return dummy.next