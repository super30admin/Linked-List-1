# Using recursion
# Time and space complexity : O(N) & O(N)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #Base condition
        if(head is None or head.next is None):
            return head
        reversed = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reversed
        