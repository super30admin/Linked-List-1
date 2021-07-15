# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
#Time: O(n)
#Space:O(1)
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        # forward = head.next
        prev = None
        curr = head
        while(curr):
            forward = curr.next
            curr.next = prev
            prev = curr
            curr = forward
        return prev
        
        