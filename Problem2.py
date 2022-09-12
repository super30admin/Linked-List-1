## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        left = right = head
        for i in range(n):
            right = right.next
            
        if not right:
            return left.next
        
        while right.next:
            left = left.next
            right = right.next
        left.next = left.next.next
        return head