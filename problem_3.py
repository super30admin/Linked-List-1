"""
problem_3: linked list cycle II
TC: O(n)
SC: O(1)
Approach: Use slow and fast pointers to detect cycle. If cycle is detected, move slow pointer to head and move both slow and fast pointers by one step until they meet.
"""


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return head

        slow = head
        fast = head
        has_cycle = False

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

        return fast
