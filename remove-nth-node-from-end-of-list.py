# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        first = dummy
        second = dummy
        # Move first n+1 steps ahead
        for _ in range(n + 1):
            first = first.next
        # Move both pointers until first reaches the end
        while first:
            first = first.next
            second = second.next
        # Remove the nth node from end
        second.next = second.next.next
        return dummy.next
        