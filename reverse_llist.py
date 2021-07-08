"""
// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Ambiguity about complexity
// Your code here along with comments explaining your approach
Algorithm explanation
      1-  2-  3-  4-  5-  6
prev  cur cn 

Iterative
- Iniital configuration - 3 pointers, prev, curr, currnext(curr's next)
- In each round of iteration we reverse two nodes using 3 pointers and 
update the curr and repeat the steps till curr is None
- Return prev
Recursive( tail recursion)
- Updating the head's next to point to prev node in one recursive call
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        #Recursive soln
        if not head or not head.next:
            return head
        temp = self.reverseList(head.next)
        #updating head's next to point to prev node
        head.next.next = head
        head.next = None
        return temp
        
        #Iterative
        prev,curr = None,head
        while curr:
            currnext = curr.next
            curr.next = prev
            prev = curr
            curr = currnext
        return prev