# S30 Big N Problem #48 {Easy}
# LC pproblem - 206. 

# Reverse Linked List

# Time Complexity : O(n) n=no. of nodes in the linked list
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Iterative approach using 2 pointers 



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        prev=None
        
        curr=head 
        
        while curr!=None:
            
            temp=curr.next
            curr.next=prev
            prev=curr
            curr=temp
        
        return prev
        