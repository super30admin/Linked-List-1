# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head==None:
            return
        prev=None
        curr=head
        fast=head.next
        while(fast!=None):
            curr.next=prev
            prev=curr
            curr=fast
            fast=fast.next
        curr.next=prev
        return curr
 
 time complexity is O(n)
 Space is O(1)
