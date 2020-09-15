# Leetcode problem link : https://leetcode.com/problems/reverse-linked-list/
# Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(n) space => Copy to another linked list by creating new nodes
    
        Optimized approach: O(n) => 1. Maintain 3 pointers
        2. current will keep track of current node
        3. Prev and Next will track current's previous node and current's next node respectively
        4. When current becomes null, prev will be pointing to the last element, which after reversing becomes the new head.
        5. Return previous pointer
        
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return None
        
        prev = None
        curr = head
        next = None
        
        while(curr):
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        
        
        return prev
        