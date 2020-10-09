# Time Complexity: O(N)
# Space Complexity: O(1)
# Leetcode all test cases passed: Yes
# Any difficulties: No
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        prev = head        
        slow = head
        fast = head
        
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                while prev != slow:
                    prev = prev.next
                    slow = slow.next
                return prev
        return None
