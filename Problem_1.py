"""
Time Complexity : O(n) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
We did both recursive and iterative approach here.

"""

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


class Solution(object):
    def reverseList(self, head):
        if not head or not head.next:
            return head
        reversedHead = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reversedHead

        # if not head:
        #     return head
        # prev=None
        # fast=head.next
        # while head and head.next:
        #     head.next=prev
        #     prev=head
        #     head=fast
        #     fast=fast.next
        # head.next=prev
        # return head
