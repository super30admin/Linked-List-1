# Time Complexity: O(n)
# Space Complexity: O(1)
# Ran on Leetcode: Yes

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head:
            return None
        node = ListNode(-1, head)
        head = node
        slow = head
        fast = head
        i = 0
        while i <= n:
            fast = fast.next
            i += 1
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return head.next