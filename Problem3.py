# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        cycle = False

        # Check for cycle
        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                cycle = True
                break

        if not cycle:
            return None

        slow = head
        # Return the Begin of the Cycle
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow