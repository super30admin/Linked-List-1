# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# This is a HashMap solution
# Space complexity is O(n)
# Time complexity is O(n)


class Solution:
    def detectCycle(self, head):
        if head is None:
            return None
        cur = head
        hmaps = {}
        while cur and cur.next:
            if cur not in hmaps:
                hmaps[cur] = cur
            else:
                return hmaps[cur]
            cur = cur.next

        return cur.next
