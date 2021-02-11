'''
Implementation: Using slow and fast pointers
Time complexity: O(n)
Space complexity: O(1)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow_p = head
        fast_p = head
        dummy = head
        
        while slow_p and fast_p and fast_p.next:
            slow_p = slow_p.next
            fast_p = fast_p.next.next
            if slow_p == fast_p:
                while dummy != slow_p:
                    slow_p = slow_p.next
                    dummy = dummy.next
                return slow_p
        return None