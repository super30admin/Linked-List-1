
# TC:O(n)
# SC:o(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head is None:
            return None

        slow = head
        fast = head

        if slow.next is None:
            return None
        else:
            slow = slow.next
        if slow.next is None:
            return None
        else:
            fast = slow.next

        while fast is not None and fast.next is not None:
            if fast is slow:
                break
            fast = fast.next.next
            slow = slow.next

        if fast is None or fast.next is None:
            return None

        slow = head

        while slow is not fast:
            slow = slow.next
            fast = fast.next

        return slow
