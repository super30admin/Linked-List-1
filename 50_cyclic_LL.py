# S30 Big N Problem #50 {Medium}

# LC - 142. 
# Linked List Cycle II

# Time Complexity : O(n) n=no. of nodes in the linked list
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        intersect=self.helper(head)
        if intersect==None :
            return None
        
        slow=head
        fast=intersect
        
        while slow!=fast:
            slow=slow.next 
            fast=fast.next
            
        return slow
    
    def helper(self,head):
        
        slow=head
        fast=head
        
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            
            if slow==fast:
                return slow
        
        return None
          
            
            
        
            
        