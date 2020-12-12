# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        def isCycle(head):
            if not head: return None
            if not head.next: return None
            slow, fast = head, head
            while fast and fast.next:
                slow = slow.next
                fast = fast.next.next
                if slow == fast:
                    break

            return slow if slow == fast else None

        slow = isCycle(head)
        if not slow: return None
        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow