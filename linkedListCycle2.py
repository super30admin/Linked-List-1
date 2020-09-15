# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
"""
Using fast and slow pointer, we check whether we have a cyclic or acylic Linked list.
if an intersection is found we then move with 2 pointer one from head and other from intersection so then we reach the cylic beginning node
"""

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head is None: return None
        
        intersect = self.getIntersect(head)
        if intersect is None: return None
        
        pt1 = head
        pt2 = intersect
        while pt1 != pt2:
            pt1 = pt1.next
            pt2 = pt2.next
        
        return pt1
    
    def getIntersect(self, head):
        slow = head
        fast = head
        
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                return slow
            
        return None