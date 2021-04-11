# Time Complexity: O(n)
# Space Complexity: O(1)
# Ran on Leetcode: Yes

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return None
        prev = None
        curr = head
        fast = head.next
        while fast:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next  = prev
        return curr
            