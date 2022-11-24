# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
'''
Time Complexity --> O(n)
Space Complexity -->
O(n) since we are using hash map
'''

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        curr = head
        dit = {}
        while curr:
            if curr not in dit:
                dit[curr] = 1
            else:
                return curr
            curr = curr.next
        return None
            
        
        #O(n) Time
        
            
        