"""
Problem: reverse Linked List
Approach: relink the next node with curr node and go forward
t.c.=> O(n)
s.c. => O(1)
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        def helper(head):
            if not head or not head.next:
                return head
            ret = helper(head.next)
            head.next.next = head
            head.next = None
            return ret
        return helper(head)