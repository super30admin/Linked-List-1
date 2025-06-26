# Time Complexity : O(n), where n is the number of nodes in the list
# Space Complexity : O(1), constant space used
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# I used Floyd’s Tortoise and Hare algorithm.
# First, I detected if a cycle exists using two pointers (slow and fast).
# Once they meet, I reset one pointer to the head.
# Then, moving both one step at a time, the point where they meet again is the start of the cycle.
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = fast = head

        # Step 1: Detect cycle
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break
        else:
            return None  # No cycle

        # Step 2: Find the start of the cycle
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow
