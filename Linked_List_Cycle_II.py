# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        s_ptr, f_ptr = head, head 
        has_cycle = False
        
        # Find intersection point
        while f_ptr and f_ptr.next:
            f_ptr = f_ptr.next.next 
            s_ptr = s_ptr.next      
            if s_ptr == f_ptr:
                has_cycle = True
                break
        
        # Return if cycle does not exists
        if not has_cycle:
            return None
        
        s_ptr = head 
        
        # Find the head of the cycle
        while s_ptr != f_ptr:
            s_ptr = s_ptr.next 
            f_ptr = f_ptr.next 
        
        return s_ptr
        
### Complexity Analysis

# Time Complexity: O(N) --> Number of nodes in the Linked List
# Space Complexity: O(1) --> Constant space occupied by slow and fast pointers
