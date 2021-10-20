# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head):
        fast = head
        slow = head

        while (fast is not None and fast.next is not None):
            fast = fast.next.next
            slow = slow.next

            if (slow == fast):
                dummy = head
                while (dummy != slow):
                    dummy = dummy.next
                    slow = slow.next

                return slow
        return None

    # TC:O(n)
    # SC:O(1)






