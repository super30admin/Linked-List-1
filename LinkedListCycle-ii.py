# // Time Complexity : O(N)
# // Space Complexity : O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return
        slow = fast = head
        loopOccured = None
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                loopOccured = slow
                break
        if not loopOccured:
            return
        slow = head

        while slow != loopOccured:
            slow = slow.next
            loopOccured = loopOccured.next
        return loopOccured


