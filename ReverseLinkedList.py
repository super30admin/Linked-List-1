# Time Complexity : O(N) where N is the number of nodes in the linked list
# Space Complexity : O(N) as we only use a constant amount of extra space for pointers
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach:
# I am using a recursive approach to reverse the linked list.
# The base case checks if the head is None or if it is the last node (head.next is None).
# If so, it returns the head as the new head of the reversed list.
# For other nodes, I recursively call reverseList on the next node.
# After the recursive call returns, I adjust the pointers to reverse the link between the current node and the next node.
# Finally, I set the next pointer of the current node to None to avoid cycles and return the new head of the reversed list.

from typing import Optional
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        current = self.reverseList(head.next)
        print(current.val)
        head.next.next = head
        head.next = None
        return current