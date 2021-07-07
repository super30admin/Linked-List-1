#
# Time Complexity = O(n)
# Space Complexity = O(n) for recursive solution / O(1) for iterative
#
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev= None
        curr = head
        while curr:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        return prev


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        n = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return n

    

