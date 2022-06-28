#Time complexity: O(n)
#space complexity: O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        rev = self.reverseList(head.next)
        print(rev.val)
        head.next.next  = head
        head.next = None
        return rev
