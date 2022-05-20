#Time complexity: O(n)
#Space complexity: O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head):
        prev=None
        current=head
        while(current!=None):
            next1=current.next
            current.next=prev
            prev=current
            current=next1
        head=prev
        return head
        