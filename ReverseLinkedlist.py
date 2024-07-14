#// Time Complexity : O(n) 
# // Space Complexity : O(1)   
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head

        while curr:
            next =curr.next
            curr.next = prev
            prev =curr
            curr = next
        return prev
    

# Approach:
# we will kepp track of the next elemet in next and point the next of xurrent to previous and continue the same way.