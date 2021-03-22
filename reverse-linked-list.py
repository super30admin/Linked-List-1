# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Time complexity: o(n)
# space complexity: o(1)
class Solution:
    def reverseList(self, head: ListNode) -> ListNode: 
        curr = head 
        prev = None
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev
