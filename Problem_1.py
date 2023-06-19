"""
Problem : 1

Time Complexity : O(n)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

creating two pointers,
one to point to previous node, another to point to current node
saving the next node before deleting the link between prev and next and making it current node at the end
"""

# Reverse linked list

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prev=None
        curr=head

        while curr:
            temp=curr.next
            curr.next=prev
            prev=curr
            curr=temp
        return prev