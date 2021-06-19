# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        new_head = None
        while head:
            tmp = head.next
            head.next = new_head
            new_head = head
            head = tmp

        return new_head
