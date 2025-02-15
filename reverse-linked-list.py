# Time Complexity : O(n) - n is number of elements in the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
Keep a prev pointer to track the previous node
"""

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """

        prev = None
        current = head

        while current is not None:
            tmp = current.next
            current.next = prev
            prev = current
            current = tmp

        return prev