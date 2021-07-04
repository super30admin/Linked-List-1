# Time Complexity : O(n) where n is number of elements in the list
# Space Complexity : O(n) #space for recursive stack
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# recursive solution
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: ListNode):
        if not head or not head.next:
            return head
        prev = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return prev
