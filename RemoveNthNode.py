"""
Given the head of a linked list, remove the nth node from the end of the list and return its head.

"""

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on leetcode : Yes
# Any problem you faced while coding this : No


from typing import List

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        # point dummy as a node before head node
        dummy = cur = ListNode(0, head) 

        # point both slow and fast to dummy
        slow = dummy
        fast = dummy
        count = 0

        # move only fast pointer until we reach n. This creates a window to slide
        while count < n:
            fast = fast.next
            count += 1

        # Once we reach n, we have the window. So we slide both fast and slow with same speed.
        # when fast reaches null (end of list), next element to slow is the one we want to remove
        while fast.next != None:
            slow = slow.next
            fast = fast.next
        
        # So Change links at slow pointer to remove nth node
        slow.next = slow.next.next

        # Returning head (dummy is att -1 location so dummy.next points to head)
        return dummy.next