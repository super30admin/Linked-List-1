# Time complexity: O(N)
# Space complexity: O(1)
# Compiled on Leetcode?: Yes

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        previous = None
        current = head
        while current is not None:
            nxt = current.next
            current.next = previous
            previous = current
            current = nxt
        return previous  