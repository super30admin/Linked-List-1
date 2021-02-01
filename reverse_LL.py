"""
Iterative 
Time Complexity: O(n)
Space Complexity: O(1)
"""
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if (not head) or (not head.next): return head
        curr = head
        prev = None
        fast = head.next
        
        while fast:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        
        curr.next = prev
        return curr
"""
Recursive 
Time Complexity: O(n)
Space Complexity: O(n) # Recursive stack space
"""
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if (not head) or (not head.next): return head
        
        revers = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        
        return revers