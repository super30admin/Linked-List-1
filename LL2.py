#Time complexity: O(n)
#Space complexity: O(1)
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
        flag = False
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        if not flag:
            return None
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
