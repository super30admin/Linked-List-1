# Approach: Use Floyd’s Cycle Detection to find a meeting point,
# then reset one pointer to head and move both one step at a time to locate the cycle’s entry point
# TC = O(n) — Each pointer visits at most n nodes
# SC = O(1) — Uses constant space with two pointers
from typing import Optional


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow, fast = head, head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                slow = head

                while slow != fast:
                    slow = slow.next
                    fast = fast.next
                return slow
        return None


n1 = ListNode(3)
n2 = ListNode(2)
n3 = ListNode(0)
n4 = ListNode(-4)

n1.next = n2
n2.next = n3
n3.next = n4
n4.next = n2

sol = Solution()
res = sol.detectCycle(n1)
print(res.val if res else "No cycle")
