# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
'''// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach

'''
class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        
#         if head==None:
#             return False
        
        slow=head
        fast=head
        
        while(fast!=None and fast.next!=None ):
            slow=slow.next
            fast=fast.next.next
            
            if (slow==fast):
                return True
            
        return False
            
