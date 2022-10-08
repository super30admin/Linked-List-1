# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
from typing import Optional
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head or not head.next:
            return None
        dummyNode = ListNode(-1, head)
        
        slow, fast = dummyNode, dummyNode
        count = 0
        
        # create required distance between slow and fast
        while count <= n:
            fast = fast.next
            count += 1
            
        while fast:
            fast = fast.next
            slow = slow.next
            
        slow.next = slow.next.next
        
        #return head
        return dummyNode.next # dont return head. return dummy.next
        