## Problem1 (https://leetcode.com/problems/reverse-linked-list/)

# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        cur = head
        while cur:           
            next_hop = cur.next
            cur.next = prev  
            prev = cur
            cur = next_hop    
        return prev