# Time Complexity : O(n) where n is the number of nodes.
# Space Complexity : O(1).
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : No.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while(curr != None):
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        head = prev
        return head
