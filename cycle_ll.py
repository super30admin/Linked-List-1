# Time Complexity : O(n) : n- no.of elements
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : Two pointers(slow and fast)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        cycle_found = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                cycle_found = True
                break

        if not cycle_found:
            return None

        fast = head

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow
        