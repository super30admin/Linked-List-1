class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                while slow != head:
                    slow = slow.next
                    head = head. next
                return slow
        return None

# Time complexity : O(N)
# Space complexity : O(1)
