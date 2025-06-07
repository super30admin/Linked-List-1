# // Time Complexity : o(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : was able to do after class intuition with dummy node


# // Your code here along with comments explaining your approach
#  the idea is to move fast pointer with a gap of n nodes and slow at its own place . This way when fast becomes null we know we will be standing at node-1 index
# once we find that node we can just adjust pointers to delete the mid node

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
from typing import Optional
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(None)
        dummy.next = head
        slow, fast = dummy, dummy
        count=0
        while count<=n and fast:
            fast = fast.next
            count+=1
        while  fast :
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        
        return dummy.next
        
        