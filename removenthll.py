# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        #dummy cuz we need it for the empty list case 
        dummy= ListNode(0)
        dummy.next= head
        start= dummy 
        fast= dummy
        count=0

        for _ in range (n+1):
            fast=fast.next
        
        while fast:
            start= start.next
            fast= fast.next

       
        start.next= start.next.next
        return dummy.next 
        
        #whats the diff bw returning head and dummy.next ; it handles 
        #removal cases, (dummy is a sentinel node)