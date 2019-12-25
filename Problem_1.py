# Run on leetcode
# Runtime - O(n)
# Memory - O(1)

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return None
        previous = None
        while head is not None:
            temp = head.next
            head.next = previous
            previous = head
            head = temp
        return previous
