"""
TC: O(N) {we iterate through the linked list once with two pointers}
SC: O(1) {we only use constant extra space for pointers}

Approach:

We use a dummy node pointing to the head to simplify edge cases (like removing the first node).
Initialize two pointers: slow at dummy and fast at head.
First, move the fast pointer n steps ahead.
Then, move both slow and fast one step at a time until fast reaches the end.
At this point, slow will be right before the node to be removed.
Update slow.next to skip the target node.
Finally, return dummy.next as the new head of the list.

The problem ran successfully on LeetCode.
"""


from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)

        slow, fast = dummy, head

        while n > 0 and fast:
            fast = fast.next
            n-=1

        while fast:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next

        return dummy.next