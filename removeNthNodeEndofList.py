# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
"""
we use 2 pointer approach where we maintain the distance of n between the first and second pointer.
we move the first pointer by n and then move both pointer till first reach the end and use the second pointer to connect current node with next next node.
"""

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(0,head)
        first = dummy
        second = dummy
        for i in range(n+1):
            first = first.next
        
        while(first != None):
            first = first.next
            second = second.next
        
        second.next = second.next.next
        return dummy.next