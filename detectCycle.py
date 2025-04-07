# This solution detects the node where a cycle begins in a linked list using Floyd's Tortoise and Hare algorithm.
# First, it uses two pointers (slow and fast) to detect if a cycle exists.
# Once they meet, a new pointer is used to find the entry point of the cycle by moving both pointers one step at a time.

# Time Complexity: O(n), where n is the number of nodes in the list. Each pointer traverses the list at most twice.
# Space Complexity: O(1), since no extra space is used beyond a few pointers.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                # Cycle detected; now find the entry point
                entry = head
                while entry != slow:
                    entry = entry.next
                    slow = slow.next
                return entry

        return None
