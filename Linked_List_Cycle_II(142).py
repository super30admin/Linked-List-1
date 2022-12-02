# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Here we use the approach of a fast and slow pointer
# There would always be point where fast would catch up to slow if there is a cycle
# if it they catch up it means that there is a cycle found
# once they catch up we take the fast to the beginning and move both fast and slow one step at a time
# the point where they catch up is the point where the cycle begins

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        has_cycle:bool = False
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                has_cycle = True
                break
        if not has_cycle:
            return None
        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow