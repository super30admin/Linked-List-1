# Time Complexity : O(N)
# (Each pointer traverses at most a few times through the list.)
#
# Space Complexity : O(1)
# (We only use two pointers and a flag variable — constant extra space.)
#
# Did this code successfully run on Leetcode : Yes
#
# Any problem you faced while coding this :
# The tricky part is understanding why resetting 'slow' to head
# and moving both one step at a time finds the cycle start node.

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Edge case: if the list is empty, there’s no cycle
        if not head:
            return None

        # Initialize two pointers, both starting at the head
        slow, fast = head, head
        flag = False  # Will become True once a meeting point is found inside a cycle

        # Step 1: Detect if there’s a cycle using Floyd’s Tortoise and Hare algorithm
        # Move slow by 1 step, fast by 2 steps
        while fast.next is not None and fast.next.next is not None:
            slow = slow.next
            fast = fast.next.next

            # If slow and fast meet, there is a cycle
            if slow == fast:
                flag = True
                break

        # If no meeting point was found → no cycle
        if not flag:
            return None

        # Step 2: Find the starting node of the cycle
        # Move 'slow' back to head, keep 'fast' at meeting point.
        # Move both one step at a time; the point where they meet again is the cycle start.
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        # Both pointers now point to the cycle’s starting node
        return slow
