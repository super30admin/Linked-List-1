# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        """
            1 -> 2 -> 3 -> 4 -> 5 -> Null
            ^
            |
          prev->curr 
          None <- 1  
          prev <- 1

            Create None pointer and have a pointer "curr" that points to head..
            then each iteration of "curr" temp will be the curr.next's and curr.next will point 
            to prev... then advance the two pointers (pre and curr)
        """
        prev = None 
        curr = head 

        while curr: 
            temp = curr.next 
            curr.next = prev 
            prev = curr
            curr = temp 

        return prev