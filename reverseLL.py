# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Brute Force solution:
# Push values in the stack and pop them out
# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        #iterative method- before class
        #1. initialize 3 pointers: prev, curr, next
        #2. traverse through the linked list as follows:
        #   -store current node's next in a next
        #   -change current's next to point to previous node
        #   -assign current node to the prev node
        #   -make the current node's value as next
        
        prev = None
        curr = head
        next = None
        
        while curr:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        
        #return prev as the curr points to null
        return prev
        
        
        
        
        
        