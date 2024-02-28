# https://leetcode.com/problems/remove-nth-node-from-end-of-list/

# Time Complexity : O(N) where N is number of nodes in the linkedlist.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach.

# Approach : We start with two pointer approach. We have fast and a slow pointer. Fast pointer first moves n + 1 steps
# and stops there. Then we start moving slow [initially at head] and fast by one step at a time until fast is none.
# then we remove the node next to slow and return the dummy.next


from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        size = 0
        dummy = ListNode(0, head)
        slow, fast = dummy, dummy

        while n != -1 and fast is not None:
            n -= 1
            fast = fast.next

        while fast is not None:
            slow = slow.next
            fast = fast.next

        if slow.next is not None:
            slow.next = slow.next.next

        return dummy.next
