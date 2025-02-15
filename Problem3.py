# Problem 3 : Linked List Cycle II
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
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Initialize slow and fast pointer
        slow, fast = head, head
        # loop till fast and fast.next is None
        while fast and fast.next:
            # Move slow pointer by one position and fast pointer by 2 poition
            slow = slow.next
            fast = fast.next.next
            # if slow and fast are equal it means the linked list has cycle
            if (slow == fast):
                # reset fast pointer to head
                fast = head
                # loop until slow is not equal to fast. Both pointers will meet at cycle's start node
                while (slow != fast):
                    # move both pointer by one position
                    slow = slow.next
                    fast = fast.next      
                return slow
        # return None if there is no cycle in the linked list
        return None