# Time O(N)
# Space O(1)
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
        has_cycle = False
        while fast is not None and fast.next is not None:
            slow = slow.next 
            fast = fast.next.next 
            if slow == fast:
                has_cycle = True 
                break
        if not has_cycle:
            return None 
        fast = head 
        while slow != fast:
            slow = slow.next 
            fast = fast.next 
        return fast

        