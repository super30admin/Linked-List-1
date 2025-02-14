# Time Complexity : O(n), single pass
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        cur = head

        while cur:
            nxt = cur.next
            cur.next = prev
            prev = cur
            cur = nxt
        
        return prev