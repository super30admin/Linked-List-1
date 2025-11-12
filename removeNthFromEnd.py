# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0,head)

        right = left = dummy 
        while n > 0:
            left = left.next 
            n -= 1 
        

        while left.next:
            right = right.next 
            left = left.next 
        
        right.next = right.next.next

        return dummy.next 

        


        

        

