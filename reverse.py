# Time complexity : O(n)
# Space complexity : O(n)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        if head:
            head = self.reverse(head)
        return head

    def reverse(self, head: ListNode):
        
        if not head.next:
            return head

        prev = self.reverse(head.next)
        
        head.next.next = head
        head.next = None
        return prev