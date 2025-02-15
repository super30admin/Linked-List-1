# Problem 2 : Remove Nth Node From End of List
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
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # Initialize the counter to 0 to move faster pointer to n position
        count = 0
        # Created a dummy node. dummy.next will point to head
        dummy = ListNode()
        dummy.next = head
        # Initialize slow and fast pointer and set to dummy
        slow, fast = dummy, dummy
        # loop till count is not greater than n
        while (count < n):
            # move the fast pointer by one position. So the gap between slow and fast pointer will be n.
            fast = fast.next
            count += 1
        # now loop till the fast or fast.next is not None
        while(fast is not None and fast.next is not None):
            # both the pointers will move by one postion
            slow = slow.next
            fast = fast.next
        # marking the slow.next to slow.next.next to remove the nth node from the linked list
        # At this time slow will be n-1th node from the end 
        slow.next = slow.next.next
        return dummy.next