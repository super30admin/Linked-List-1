# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

# Time Complexity : O(n)
# Space Complexity: O(1)

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return
        
        hasCycle = False
        slow = head
        fast = head
        
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break
                  
        if not hasCycle:
            return
        
        slow = head
        
        while slow != fast:
            slow = slow.next
            fast = fast.next
            
        return fast
        