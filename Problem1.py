# Problem 1 : Reverse Linked List
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
'''
None
'''

# Your code here along with comments explaining your approach
from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Take a dummy node
        dummy = ListNode()
        # Previous pointer will point to dummy.next ie None
        prev = dummy.next
        # Current pointer point to head
        current = head
        # Loop till the current is not None
        while(current is not None):
            # Store next node of current in temp
            temp = current.next 
            # Set the current.next to prev node
            current.next = prev
            # Set prev to current node
            prev = current
            # Set current node to temp node
            current = temp
        # Return the prev node which is head of the reverse linked list
        return prev