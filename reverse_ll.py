
#Time Complexity: O(N).
#Auxiliary Space: O(1)
#Did this code successfully run on Leetcode :Yes

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
        if head:
            prev = None
            current = head
            fast = head.next
            while(fast):
                current.next = prev
                prev = current
                current = fast
                fast=fast.next
            current.next=prev
            return current