# Runs on Leetcode
# Runtime - O(n)
# Memory - O(1)


class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head.next or not head:
            return None
        p = q = head
        
        for i in range(n):
            q = q.next
        
        if not q:
            return p.next
        
        while q.next:
            q = q.next
            p = p.next
        
        p.next = p.next.next
        return head
