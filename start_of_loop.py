#  Time Complexity : O(N)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this :


#  Your code here along with comments explaining your approach
#     first detect the cycle, if cycle is detected then we use the property that the distance left between head and loop start and fast and 
# loop start is same.


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        fast=head
        slow=head
        flag=False
        
        while(fast!=None and fast.next!=None):
            slow=slow.next
            fast=fast.next.next
            
            if(fast==slow):
                flag=True
                break
        slow=head
        if(flag):
            while(slow!=fast):
                slow=slow.next
                fast=fast.next
            return slow
        return None