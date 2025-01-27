'''
Time Complexity : 0(n)
Space Complexity : 0(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    
    def __init__(self):
        self.slow = None
        self.fast = None
    
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        self.slow = head
        self.fast = head
        isCycle = False
        
        # Iterate the linked-list to check for cycle
        while self.fast!= None and self.fast.next != None:
            
            # move slow ptr by 1x speed
            self.slow = self.slow.next
            
            # move fast ptr by 2x speed
            fastCount = 0
            while fastCount != 2:
                if self.fast != None:
                    self.fast = self.fast.next
                    fastCount+=1
                    continue
                else:
                    isCycle = False
                    break
            
            # check if slow and fast ptr are same
            if (self.slow == self.fast) and (self.slow != None and self.fast!= None):
                isCycle = True
                break
                
            continue
        
        # Check for isCycle condition
        if isCycle == False:
            return None
        
        # Got the cycle, check for intersection
        self.slow = head
        
        while self.slow != self.fast:
            
            self.slow = self.slow.next
            
            if self.slow != self.fast:
                self.fast = self.fast.next
                continue
            else:
                break
        
        return self.slow