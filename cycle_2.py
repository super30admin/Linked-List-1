# The code defines a detectCycle method to detect if a cycle exists in a linked list and, if so, return the node where the cycle begins.
# The method uses the Floyd's Cycle Detection Algorithm (two-pointer approach).

# Step 1: Detect if a Cycle Exists
#   - Initialize two pointers, 'slow' and 'fast', both starting at the head of the list:
#       - 'slow' moves one step at a time.
#       - 'fast' moves two steps at a time.
#   - Traverse the list:
#       - Move 'slow' and 'fast' as described until:
#           - 'fast' meets 'slow', indicating a cycle exists, or
#           - 'fast' or 'fast.next' becomes None, indicating no cycle.
#   - If no cycle is detected (fast.next or fast.next.next is None), return None.

# Step 2: Find the Start of the Cycle
#   - If a cycle is detected, reset 'slow' to the head of the list.
#   - Move both 'slow' and 'fast' one step at a time until they meet:
#       - The meeting point is the start of the cycle, as proven by Floyd's algorithm.

# Final Result:
#   - If a cycle exists, return the node where the cycle begins.
#   - If no cycle exists, return None.

# TC: O(n) - The list is traversed a maximum of twice: once to detect the cycle and once to find the start of the cycle.
# SC: O(1) - The space complexity is constant as only two pointers are used.

    

from typing import Optional


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return
        
        slow, fast = head, head
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow: break

        if not fast.next or not fast.next.next: 
            return

        slow = head

        while slow != fast:
            
            slow = slow.next
            fast = fast.next

        return slow
                