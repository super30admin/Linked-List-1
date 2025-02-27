"""

## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

#TC: O(N)
#SC: O(1)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None: return None
        slow = fast = head
        hasCycle = False

        #first pass to find the loop
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break

        if not hasCycle:
            return 

        fast = head
        # seconda pass to find the index
        while fast != slow:
            slow = slow.next
            fast = fast.next
            

        return slow



