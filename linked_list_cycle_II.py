# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
from typing import ListNode, Optional
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        flag = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if(slow == fast):
                flag = True
                break
        
        if(not flag):
            return None
        
        fast = head
        while(slow != fast):
            slow = slow.next
            fast = fast.next
        
        return slow
        