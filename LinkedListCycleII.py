#Time Complexity: O(n)
#Space Complexity: O(1)
#Successfully ran on leetcode

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return None
        slow = head
        fast = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            if slow==fast:
                fast = head
                while slow!=fast:
                    slow = slow.next
                    fast = fast.next
                return slow
        return None