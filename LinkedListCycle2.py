# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        # Floyd's Algorithm - Slow Pointer Fast Pointer
        # 2(X+A)= X+A+B+A --> X=B
        # Time Complexity - O(N)
        # Space Complexity - O(1) Inplace
        
        # base case
        if head == None or head.next == None:
            return None
        
        slow=head
        fast = head
        
        # Finding the cycle
        
        while(fast != None and fast.next != None):
            slow=slow.next  # Slow pointer moving ahead by 1 node
            fast=fast.next.next # Fast Pointer moving ahead by 2 node
            
            if slow == fast:# Cycle found
                p1 = head # When p1 and slow becomes same, that will be the start of the cycle
                
                while(p1 != slow): # For finding the node where the cycle begins
                    p1=p1.next
                    slow=slow.next
                    
                return slow
            
        return None  # When no cycle detected
            