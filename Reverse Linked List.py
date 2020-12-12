# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head: return None

        prev = None
        current = head
        nextNode = current.next

        while nextNode:
            current.next = prev
            prev = current
            current = nextNode
            nextNode = current.next

        current.next = prev
        return current



