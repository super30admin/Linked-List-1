"""Approach:
Use 2 pointers
set both to head, then increment p1 1 step and p2 2 steps.
Once they both meet, break the loop. If the loop is broken because of p2 reaching None, then return. There's no cycle.
Outside loop, double check p1!=p2. if so, return None.
Else, reset p2 to head, and start increasing both pointers 1 step at a time, till p1!=p2
return p1 or p2. They have met. So doesn't matter which one you return.
TC O(n)
SC O(1)
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        p1, p2 = head, head
        
        while p2:
            p1 = p1.next
            p2 = p2.next
            if p2:  # we want p2 to go 2 steps, but we want to check if p2 is still valid
                p2 = p2.next  # it may otherwise try to do .next on a NoneType Object
            else:  # if it is None, then there's no cycle. hence return
                return None
            if p1 == p2:
                break
        if p1 != p2: return None   # if we broke out of loop due to p2 being None, we still want to check p1!=p2
        
        # then we set p2 back to head
        p2 = head
        while p1 != p2:  # and while p1 doesn't meet p2, increase each pointer 1 step
            p1, p2 = p1.next, p2.next
            
        return p1