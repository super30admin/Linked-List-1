# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    # TC : O(n)
    # SC : O(n)
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        revp = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return revp