# Time Complexity: O(n)
# Space Complexity: O(1)

from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return
        
        slow = head
        fast = head
        hasCycle = False

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break
            
        if not hasCycle:
            return None
        
        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next
        
        return slow
