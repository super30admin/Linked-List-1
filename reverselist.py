# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None

        prev = None
        curr = head
        post= head.next

        while curr: 
            #curr is the head, so it traverses until curr is None
            post=curr.next
            #next step is the reversal step
            curr.next= prev 
            #fin use of prev, so change that in next line
            prev= curr 
            #fin use of curr, so change that in next line
            curr =post 
            #fin use of post change that first
    
        

        return prev
        #cuz prev is now at end, as curr reached None