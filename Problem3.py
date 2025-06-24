# Time Complexity : O(n) — where n is the number of nodes in the list
# Space Complexity : O(1) — constant space using only two pointers
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Three line explanation of solution in plain English:
"""
1. We use two pointers — slow and fast — to detect a cycle in the linked list using Floyd’s Cycle Detection Algorithm.
2. If they meet, there is a cycle; we then reset one pointer to the head and move both one step at a time.
3. The point where they meet again is the start of the cycle, which we return.
"""
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
        if head is None or head.next is None: return None
        slow=head
        fast=head
        flag=False
        # detect cycle using two pointers slow and fast
        # slow moves one step at a time, fast moves two steps at a time

        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                flag=True
                break
        # if no cycle is detected, return None
        # if a cycle is detected, reset one pointer to head and move both pointers one step at a time
        # the point where they meet again is the start of the cycle
        if not flag:
            return None
        #find the start node of the cycle
        
        slow=head
        while slow!=fast:
            slow=slow.next
            fast=fast.next
        return slow