# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        # Use slow and fast pointer to find the cycle
        # Now reset slow pointer to the start
        # Move slow and fast pointer one node at a time
        # The meeting node should be the start node of the cycle

        # Time Complexity = O(n)
        # Space Complexity = O(1)

        if head is None:
            return head
        slow = head
        fast = head
        hasCycle = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                hasCycle = True
                break

        if (not hasCycle):
            return None

        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow

