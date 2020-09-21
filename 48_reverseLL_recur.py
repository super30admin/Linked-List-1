# Reverse Linked List

# Time Complexity : O(n) n=no. of nodes in the linked list
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Recursive approach using 2 pointers 


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        return self.helper(head,None)
        
    
    
    def helper(self,node,prev):
        
        if node is None:
            return prev
        
        temp=self.helper(node.next,node)
        
        
        node.next=prev
        
        return temp
        
        
        
        