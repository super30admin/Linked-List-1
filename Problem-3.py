#Time Complexity :O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this : tried running sum.
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        fast=head
        slow=head
        isCycle=False
        
        while(fast!=None and fast.next!=None):
            slow=slow.next
            fast=fast.next.next
            if(fast==slow):
                isCycle=True
                break
            
        if(not isCycle):
            return None
        
        fast=head
        while(fast!=slow):
            fast=fast.next
            slow=slow.next
            
        return fast
                
        