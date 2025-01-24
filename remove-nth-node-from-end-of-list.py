"""

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:

Input: head = [1], n = 1
Output: []

Example 3:

Input: head = [1,2], n = 1
Output: [1]

Time Complexity:
- Two-pass method: O(N) (one pass to find length, another to delete node)
- One-pass method: O(N) (single traversal with two pointers)
Space Complexity:
- Both methods: O(1) (only a few pointers used)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# Approach:
# 1. The first method (two-pass) calculates the length of the list, then removes the (length - n)th node from the start.  
# 2. The second method (one-pass) uses two pointers: one moves `n+1` steps ahead, then both move together until the first reaches the end, allowing removal of the target node.  
# 3. Both methods use a dummy node to handle edge cases like removing the head node.  

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
      
        # Method 1: Two-pass algorithm
        cur = head
        length = 0

        while cur:
            length += 1
            cur = cur.next

        length -= n

        dummy = ListNode()
        dummy.next = head

        cur = dummy

        while length > 0:
            length -= 1
            cur = cur.next
        
        cur.next = cur.next.next

        return dummy.next

        # Method 2: One-pass algorithm
        dummy = ListNode()
        dummy.next = head

        slow = dummy
        fast = dummy

        for i in range(n+1):
            fast = fast.next
        
        while fast:
            fast = fast.next
            slow = slow.next
        
        slow.next = slow.next.next

        return dummy.next
