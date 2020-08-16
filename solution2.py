# https://leetcode.com/problems/remove-nth-node-from-end-of-list/
# // Time Complexity : o(n)
# // Space Complexity : o(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this : had to think about case when
# the first element is being deleted, resolved it with a infinite flag
#
#
# // Your code here along with comments explaining your approach
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head:
            return head
        result = self.helper(head,None,n)
        if result == float("inf"):
            return head.next
        return head
    def helper(self,curr,prev,num):
        if not curr:
            return num
        n=self.helper(curr.next,curr,num)
        #found
        if n == 1:
            if prev:
                prev.next = curr.next
            else:
                return float("inf")
        n -= 1
        return n