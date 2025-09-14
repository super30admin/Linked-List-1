# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
"""
Space Complexity: O(1) Constant memory as we on;y use pointers and one constant node

Time Complexity: O(N)
"""

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        c = n + 1

        dummy = ListNode(-1)
        dummy.next = head

        slow, fast = dummy, dummy

        for _ in range(c): 
            fast = fast.next

        while fast:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next

        return dummy.next
