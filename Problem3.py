# 142. Linked List Cycle II

# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Intuition:   
# Use two pointers to find the cycle in the linked list.
# Use a slow pointer to traverse the list and a fast pointer to traverse the list twice as fast.
# If there is a cycle, the slow and fast pointer will meet at some point.
# If there is no cycle, the fast pointer will reach the end of the list.

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                break
        if not fast or not fast.next:
            return None
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
    