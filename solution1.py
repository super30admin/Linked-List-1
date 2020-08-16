# https://leetcode.com/problems/reverse-linked-list/
# // Time Complexity : o(n) recursively visits all node
# // Space Complexity : o(length of input) due to stack
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this :no
#
#
# // Your code here along with comments explaining your approach
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return head
        return self.helper(head, None)

    def helper(self, curr, prev):
        if not curr:
            return prev
        head = self.helper(curr.next, curr)
        curr.next = prev
        return head