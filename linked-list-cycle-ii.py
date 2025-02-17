# Approach:
# Use Floyd’s Cycle Detection Algorithm (slow and fast pointers) to detect a cycle; if they meet, there is a cycle.
# Reset one pointer to head and move both pointers at the same pace to find the cycle's starting node.
# Time & Space Complexity:
# Time Complexity: O(n)
# Space Complexity: O(1) (Only two extra pointers used).
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                slow = head
                while slow != fast:
                    slow = slow.next
                    fast = fast.next
                return slow
            
        return None