# Time Complexity : O(N)    
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
    

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        if head == None:
            return None
        
        dummy = ListNode(0)
        dummy.next = head
        
        s = dummy
        f = dummy
        i = 0
        while(f!=None and f.next!=None):
            
            s = s.next 
            f = f.next.next
            
            if s == f:
                
                s = dummy
                while(s!=f):
                    s = s.next
                    f = f.next
            if s == f:
                return s
                    
                    
        
            
            
        
        
        
    