# Runs on leetcode
# Runtime - O(n)
# Memory - O(1)

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return None
        
        slow = fast = head
        
        slow = slow.next
        try:
            fast = fast.next.next
        except AttributeError:
            return None
        while slow != fast:
            slow = slow.next
            try:
                fast = fast.next.next
            except AttributeError:
                return None
        slow = head
        
        while slow != fast:
            slow = slow.next
            fast = fast.next
        
        return slow
