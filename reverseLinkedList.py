# Time Complexity : O(n) where n is number of elements in the list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# iterative solution
# Definition for singly-linked list.

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        curr = head
        while curr:  # iterative
            next_n = curr.next  # create next node
            curr.next = prev  # reverse
            prev = curr  # for next iteration
            curr = next_n  # go to next node
        return prev
