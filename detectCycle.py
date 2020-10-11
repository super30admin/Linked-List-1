"""
Time Complexity: O(N) because traversing linkedlist

Space Complexity:O(N) storing into hashmap
"""
from collections import defaultdict

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode: 
        
        hashmap = defaultdict(ListNode)
        
        while head:
            if head in hashmap:#if there already exist head pointer, return that head pointer
                return head
            hashmap[head] = True #this stores all head pointers while moving next
            head = head.next
        return None