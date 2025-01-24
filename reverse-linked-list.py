"""

Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:

Input: head = [1,2]
Output: [2,1]

Example 3:

Input: head = []
Output: []

Time Complexity: O(N)
Space Complexity: O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# This function reverses a singly linked list iteratively by updating pointers at each step.  
# It initializes two pointers, `pre` (previous node) as None and `cur` (current node) as head,  
# then iterates through the list, reversing the `next` pointer until all nodes are reversed.  

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head is None or head.next is None:
            return head

        pre = None
        cur = head

        while cur:
            temp = cur.next
            cur.next = pre
            pre = cur
            cur = temp
        
        return pre
