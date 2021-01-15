#Time Complexity :O(n)
#Space Complexity :O(1) dummy is just a single node(Not sure)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this : tried running sum.
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy=ListNode(-1)
        dummy.next=head
        slow=dummy
        fast=dummy
        
        for i in range(n+1):
            fast=fast.next
        
        while(fast!=None):
            fast=fast.next
            slow=slow.next
        
        slow.next=slow.next.next
        return dummy.next
        
            
            