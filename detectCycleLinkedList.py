# Time complexity: O(N)
# Space complexity: O(1)
# Compiled on Leetcode?: Yes

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        cycle = False
        
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

            if fast == slow:
                cycle = True
                break
        
        if not cycle:
            return None
        else:
            slow = head
            while fast != slow:
                fast = fast.next
                slow = slow.next
            return fast    