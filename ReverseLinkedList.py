# Time complexity: O(n)
# Space complexity: O(1)

class ListNode:
    def __init__(self, value=0):
        self.value = value
        self.next = None


class Solution:
    def reverseList(self, head):
        if not head or not head.next:
            return head
        prev, cur = None, head

        while cur:
            nex = cur.next
            cur.next = prev
            prev = cur
            cur = nex
        return prev
