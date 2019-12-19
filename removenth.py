# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : if not fast condition. test case [1],1

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        fast = head
        slow = head
        
        for _ in range(n):
            fast = fast.next
        
        if not fast:
            head = head.next
        else:
            while fast.next:
                fast = fast.next
                slow = slow.next

            slow.next = slow.next.next
        
        return head