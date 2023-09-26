class Solution:
    def reverseList(self, head):
        curr, prev = head, None
        while curr:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt

        return prev

        