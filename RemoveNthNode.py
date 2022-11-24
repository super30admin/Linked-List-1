# Time Complexity : O(n) where n is the length on nodes in a list 

# Space Complexity : O(1) No extra space

# Did this code successfully run on Leetcode : Yes

# Any problem you faced while coding this : No Problems faced

# Your code here along with comments explaining your approach :   

from typing import ListNode
class Solution:
    def removeNthFromEnd(self, head: ListNode, n:int) -> ListNode:
        dummy = ListNode(0, head)
        left = dummy
        right = head

        while n > 0 and right:
            right = right.next
            n -= 1
        
        while right:
            left = left.next
            right = right.next

        # delete the node which is update the left pointer 
        left.next = left.next.next
        return dummy.next



