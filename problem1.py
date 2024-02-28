# https://leetcode.com/problems/reverse-linked-list/description/

# Time Complexity : O(N) where N is number of nodes in the linkedlist.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach.

# Approach : We start with three pointer approach. We have prev, next and cur pointer.
# Prev pointer points to null at the beginning. Cur points to first node and next to next node of current
# We then reverse the links of cur and pointer and keep updating each pointer and move them one step at a time.
# When cur is None, we break the loop and return the prev pointer.ß

from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur_pointer = head
        prev_pointer = None
        next_pointer = None
        while cur_pointer is not None:
            next_pointer = cur_pointer.next
            cur_pointer.next = prev_pointer
            prev_pointer = cur_pointer
            cur_pointer = next_pointer
        return prev_pointer
