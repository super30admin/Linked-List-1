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

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        #iterative method- before class
        #1. initialize 3 pointers: prev, curr, next
        #2. traverse through the linked list as follows:
        #   -store current node's next in a temp
        #   -change current's next to point to previous node
        #   -assign current node to the prev node
        #   -make the current node's value as temp
        
        prev = None
        curr = head
        
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        
        #assign prev to point towards head
        head = prev
        
        return head
        
        
        
        
        
        