# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        first = head
        sec = head
        while sec and sec.next:
            first = first.next
            sec = sec.next.next
            if first == sec:
                first = head
                while first != sec:
                    first = first.next
                    sec = sec.next
                return first
        return None