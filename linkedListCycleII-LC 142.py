# Time Complexity = O(n)
# Space Complexity = O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        
        # Initialising the 2 pointers
        slow = head
        fast = head
        cycleExists = False
        
        
        
        # Boundary condition when LL contains 1 or 2 nodes
        # If we only check for fast != None, we will enter the loop but then our fast.next.next will become null, hence we will keep iterating to find for the cycle as slow and fast would become null after a couple of iterations. We will encounter a null pointer exception (Runtime error). Hence 2 conditions written to check and stop the loop when no cycle exists
        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                cycleExists = True
                break                           # To break out of the loop once our cycle exists
                
                
        
        # If the cycle exists, rewind the slow pointer to head and move slow and fast pointers 1 node at a time. Wherever they meet is the head of the cycle
        if cycleExists:
            slow = head
            while(fast != slow):
                slow = slow.next
                fast = fast.next
                
                
                
        # If no cycle exists, return None
        else:
            return None
        
                
        return slow                               # Head of the cycle
            
            