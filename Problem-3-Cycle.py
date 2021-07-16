# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head) :
        if head is None:
            return head
        slow = head
        fast = head
        cycle = 0

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                cycle = 1
                break
        if cycle == 1:
            slow = head
            while slow is not fast:
                slow = slow.next
                fast = fast.next
            return slow
        return None