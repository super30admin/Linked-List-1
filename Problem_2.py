"""
Problem : 2

Time Complexity : O(n)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Iterating the right pointer to n positions from right such that the left pointer will be n positions behind when started from head
then start iterating the left and right pointer together until end of linked list in encountered, this way the slow left pointer's next
node will be the node to remove as we started from dummy and are one step behind, changing the links and returning the linked list

"""

# Remove nth node from end of the list

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head, n):
        dummy=ListNode(0,head)
        left=dummy
        right=head

        while n>0 and right:
            right=right.next
            n-=1

        while right:
            left=left.next
            right=right.next

        left.next=left.next.next
        return dummy.next