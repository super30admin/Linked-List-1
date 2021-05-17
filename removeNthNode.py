"""
Intuition: Make a difference of N between 2 pointers. Then move both pointers ahead till the end.
#####################################################################
Time Complexity : O(N) 
Space Complexity : O(1)
#####################################################################
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        dummy = ListNode(0, head)
        
        p0 = dummy
        p1=  dummy
        
        for _ in range(n):
            p1 = p1.next
        
        while p1.next != None:
            p0 = p0.next
            p1 = p1.next
        
        p0.next = p0.next.next
        return dummy.next
            
            
            

                
            