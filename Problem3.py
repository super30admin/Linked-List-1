# Time Complexity: O(N)
# Space Complexity: O(1) 
# Passed Leetcode

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        if not head:
            return
        
        if head.next == head:
            return head
        
        
        slow = head
        fast = head
        
        while fast and fast.next:
            
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                
                p1 = head
                    
                while p1 != slow:
                    
                    p1 = p1.next
                    slow = slow.next
                
                return p1
        return None
            
            
            
            