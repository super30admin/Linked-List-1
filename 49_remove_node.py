# S30 Big N Problem #49 {Medium}

# LC - 19. 
# Remove Nth Node From End of List

# Time Complexity : O(n) n=no. of nodes in the linked list
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Use 2 pointers. 
# Place the pointers in such a way that the distance between them is n
# when the first pointer reaches end, remove the node in front of pointer 2 


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        dummy=ListNode(0)
        dummy.next=head
        p1=dummy
        p2=dummy
        
        for i in range(n):
            p1=p1.next
            
        
        while p1.next!=None:
            p1=p1.next
            p2=p2.next 
            
        
        p2.next=p2.next.next 
        
        return dummy.next
        
        