# Time Complexity : O(n) for each operation.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to find the cycle by two pointers slow and fast. Then move back slow to head then iterate and try to find the start of the cycle using fast.

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        flg=0
        while(fast!=None and fast.next !=None and slow !=None):
            print("Hello"+str(fast.val))
            slow=slow.next
            fast=fast.next.next
            if (slow==fast):
                flg=1
                break
        
        if(flg):
            slow=head
            while(slow!=fast):
                slow=slow.next
                fast=fast.next
        else:
            return None
        return slow
    
    