# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head):
        prev = None
        curr = head

        while head:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next

        return prev

#TC:O(n)
#SC:O(1)