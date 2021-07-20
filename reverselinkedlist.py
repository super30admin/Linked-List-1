# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # prev=None
        # curr=head
        # while curr!=None:
        #     temp1=curr.next
        #     curr.next=prev
        #     prev=curr
        #     curr=temp1
        # print(head)
        # return prev
        
        prev=None
        curr=head
        if curr==None:
            return curr
        fast=curr.next
        while fast!=None:
            curr.next=prev
            prev=curr
            curr=fast
            fast=fast.next
        curr.next=prev
        return curr
    
        #reverseList(curr,head)
        