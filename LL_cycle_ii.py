"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
Floyd's Tortoise and Hare
"""
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if (not head) or (not head.next): return None
        
        slow = head
        fast = head
        cycle = False
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast: 
                cycle = True
                break
        
        if not cycle: return None
        fast = head
        while fast != slow:
            slow = slow.next
            fast = fast.next
            
        return slow