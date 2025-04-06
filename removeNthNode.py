# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach:
# We observe that if we have 2 pointers at a distance of n, and we increment both the pointers at the same time with same value, when the fast pointer reaches the end of the linked list, the slow ponter will be pointing to the node that is to be removed.
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head, n: int):
        # Initialize a dummy node and point it to head
        # Dummy node will take care of edge case when we need to remove head
        dummy = ListNode()
        dummy.next = head

        # Initialize fast and slow pointers
        slow = dummy
        fast = slow
        # Place fast pointer to slow + n
        while n > 0 and fast != None:
            fast = fast.next
            n -= 1
        
        # Increment slow and fast until fast reaches to the end of the linked list
        while fast and fast.next:
            slow = slow.next
            fast = fast.next
        
        # When fast reaches the end, slow will be pointing to the node that needs to be removed.
        # Remove the node
        slow.next = slow.next.next
        # Dummy is pointing to head
        return dummy.next