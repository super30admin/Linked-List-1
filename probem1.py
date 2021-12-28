# Time Complexity : O(n)
# Space Complexity : 0(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None  or head.next==None :
            return head
        prev = None
        curr = head
        fast = head.next
        while fast!= None:
            curr.next = prev
            prev = curr
            curr= fast
            fast = fast.next
        curr.next = prev
        return curr