'''
TC: O(n)
SC: O(1)

Intuition: Slow pointer, Fast pointer - 2x.
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if not head or not head.next:
            return None
        
        slow, fast = head.next, head.next.next
        
        while slow != fast:
            slow = slow.next
            if fast and fast.next:
                fast = fast.next.next
                
        if not slow:
            return None
        
        fast = head
        
        while slow and slow != fast:
            slow = slow.next
            fast = fast.next
            
        return slow
        