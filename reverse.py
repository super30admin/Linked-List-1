# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not (head and head.next):
            return head
        prevnode=None
        while head:
            nextnode=head.next
            head.next=prevnode
            prevnode=head
            head=nextnode
        return prevnode
            
     
        
