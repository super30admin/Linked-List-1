# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
from typing import ListNode, Optional
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        root = ListNode(0)
        root.next = head
        first = root
        second = root

        for i in range(n+1):
            first = first.next   
        
        while first is not None:
            first = first.next
            second = second.next
        
        second.next = second.next.next

        return root.next