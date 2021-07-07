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

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None or head.next is None:
            return head
        
        rev = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return rev
