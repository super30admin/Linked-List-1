# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        left_ptr = dummy
        right_ptr = head
        
        while n>0 and right_ptr:
            right_ptr = right_ptr.next
            n-=1
            
        while right_ptr:
            left_ptr = left_ptr.next
            right_ptr = right_ptr.next
            
        left_ptr.next = left_ptr.next.next
        return dummy.next
    
    
    #space - o(1)
    # time - o(n)