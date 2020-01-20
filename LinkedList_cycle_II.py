"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : none
"""

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return None
        
        slow = head
        fast = head
        flag = False        # determines if there is a cycle found or not
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        
        # if cycle is not found, return None right away
        if not flag: return None
        
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
            
        return slow