# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head

        if head is None:
            return head

        while curr:
            nextnode = curr.next
            curr.next = prev
            curr,prev = nextnode,curr
        
        return prev