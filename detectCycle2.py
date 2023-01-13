# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes       
# Any problem you faced while coding this :No

class Solution(object):
    def detectCycle(self, head):
        fast=head
        slow=head
        while(fast!=None and fast.next!=None):
           fast=fast.next.next
           slow=slow.next
           if(fast==slow):
               break
        if(fast==None or fast.next==None):
            return None
        slow=head
        while(slow!=fast):
            fast=fast.next
            slow=slow.next
        return(slow)
       