# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None:
            return
        prev = None
        curr = head
        nxt = head.next
        while curr:
            curr.next = prev
            prev = curr
            curr = nxt
            if nxt is None:
                continue
            else:
                nxt = nxt.next
        return prev