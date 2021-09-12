# Did this code successfully run on Leetcode : YES

# TC: O(N)
# SC: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        prev = None
        curr = None
        _next = head
        while _next:
            prev = curr
            curr = _next
            _next = curr.next
            curr.next = prev
        return curr