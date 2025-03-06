"""
Iterative approach
TC - O(n)
SC - O(1)
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None: return

        # set three pointers
        prev = None
        curr = head
        fast = curr.next

        while fast is not None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        # for the last node
        curr.next = prev

        return curr