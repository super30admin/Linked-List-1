"""
Linked-List-1
Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Trick here is to do fast/slow pointer approach and the way we identify if when they both coincide we can assume there is a cycle
and stop the iteration. Now start a new iteration again by resetting the fast to head and move 1 step at a time and when they
coincide again i.e., where the result is.
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None

        slow_pointer = head
        fast_pointer = head
        has_cycle = False
        while fast_pointer != None and fast_pointer.next != None:
            slow_pointer = slow_pointer.next
            fast_pointer = fast_pointer.next.next

            if slow_pointer == fast_pointer:
                has_cycle = True
                fast_pointer = head
                break

        if has_cycle:
            while slow_pointer != fast_pointer:
                slow_pointer = slow_pointer.next
                fast_pointer = fast_pointer.next

            return slow_pointer
        
        return None
