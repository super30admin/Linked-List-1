# Time Complexity: O(n)
# Space Complexity: O(1)

# The code successfully ran on Leetcode

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None: return None
        
        fast, slow = head, head
        cycle = False
        
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            
            if fast == slow:
                cycle = True
                break
            
        if cycle:
            fast = head
            
            while fast != slow:
                slow = slow.next
                fast = fast.next
                
            return fast
                
        else:
            return None
                    
        