## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Time Complexity: O(N) - N is the number of nodes in the list. In the worst case, 
        # we might iterate through the list a constant number of times, which simplifies to O(N).
        # Space Complexity: O(1) - We only use two pointers (slow and fast), requiring constant extra memory.
        
        slow = head
        fast = head
        
        # Phase 1: Detect if a cycle exists
        while fast is not None and fast.next is not None:
            # Advance pointers first: slow takes 1 step, fast takes 2 steps
            slow = slow.next
            fast = fast.next.next
            
            # If the pointers meet, a cycle exists. Break to move to Phase 2.
            if slow == fast:
                break
                
        # If the while loop exited because we reached the end of the list (a None value),
        # it means the list is linear and has no cycle.
        if fast is None or fast.next is None:
            return None
            
        # Phase 2: Find the exact node where the cycle begins
        # Reset one of the pointers (let's use fast) back to the head of the list.
        fast = head
        
        # Move both pointers exactly 1 step at a time. 
        # Mathematically, the distance from the head to the cycle start is equal 
        # to the distance from the meeting point to the cycle start. 
        # Therefore, the exact node where they collide again is the start of the cycle.
        while slow != fast:
            fast = fast.next
            slow = slow.next
            
        # Both pointers now point to the start of the cycle, so return either one.
        return fast