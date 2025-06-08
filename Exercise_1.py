# S30 Problem #49 Reverse Linked List
#LeetCode #206 https://leetcode.com/problems/reverse-linked-list/

# Author : Akaash Trivedi
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :  Yes #
# Any problem you faced while coding this : No

# taking temp node store the next point
# using previous and current to reverse

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev