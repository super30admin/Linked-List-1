# Time Complexity : O(n) because we are traversing the linked list once
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
We reverse the linked list by using three pointers, left, mid, and right. We set the next of mid to left and then move all three pointers to the right.
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None: return None
        left, mid, right = None, head, head.next

        while right != None:
            mid.next = left
            left = mid
            mid = right
            right = right.next

        mid.next = left

        return mid