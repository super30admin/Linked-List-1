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
    
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return None
        fast = self.helper(head)
        if fast is None:
            return None
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
        
    def helper(self,head):
        slow = fast = head
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return fast
        return None
