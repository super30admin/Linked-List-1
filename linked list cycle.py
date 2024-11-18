#TC: O(n)
#SC: O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return

        slow = head
        fast = head
        cycle = False
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                cycle = True
                break
        if cycle == False:
            return
        else:
            fast = head
            while slow != fast:
                slow = slow.next
                fast = fast.next
        return fast
