# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

'''
// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach
prev=None
keep a fast pointer ---> curren.next
make current.next = prev
job of prev is done , update it and update the current
'''

// Your code here along with comments explaining your approach
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        prev=None
        current=head
        
        while(current!=None):
            fast=current.next
            current.next=prev
            prev=current
            current=fast
            
        return prev
        
