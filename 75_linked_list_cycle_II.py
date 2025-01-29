# Time complexity - O(n)
# Space complexity - O(1)

# Approach - Maintain a slow and fast pointer, there is a cycle if two coincide. Set fast back to LL's head
# and take one step till it coincides with slow. (Floyd's tortoise and hare algorithm)

from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        slow = head
        fast = head
        hasCycle = False # flag var

        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break
            
        if hasCycle == False:
            return None
            
        fast = head
        while fast != slow:
            fast = fast.next
            slow = slow.next
            
        return fast