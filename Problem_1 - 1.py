"""
Brute Force
Time Complexity : O(n)
Space Complexity : O(n)
    
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return None 
        
        set_ = set()
        
        while head:
            if head in set_:
                return head
            else:
                set_.add(head)
            head = head.next
                
        return None 
            
            
        
        