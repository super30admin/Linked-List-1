# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this problem run on Leetcode: Yes
# Any problems faced while solving this problem: No

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        first = head
        sec = head
        for _ in range(n):
            sec = sec.next
        if not sec:
            return head.next
        while sec.next:
            first = first.next
            sec = sec.next
        first.next = first.next.next
        return head