# Time Complexity : Add - O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. I am using slow and Faster pointers to detect cycle and thus detect the starting point of cycle
2. The slow pointer is increased normally at 1x spped while Fast pointer is increased at 2x speed
3. If they meet, the cycle exists, then at meeting position fast is left as it is, and slow is rest to head
4. Both slow annd fast are moved against at 1x, where these 2 meet gives the start point of cycle
'''

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        if head is None:
            return None
        
        slow = head
        fast = head
        flag = False
        while slow and fast and fast.next:
            
            slow = slow.next          
            fast = fast.next.next
            
            if slow == fast:
                flag = True
                break
        
        if flag == False:
            return None
        
        slow = head        
        while slow != fast:
            slow = slow.next
            fast = fast.next
                
        return fast