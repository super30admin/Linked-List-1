"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return head
        # Initialize three pointers to the first three elements respectively
        prev = None
        curr = head
        fast = head.next
        # Move the last pointer till it reaches the end of Linked list
        # We update each pointers to their previous pointers values
        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        # At this point my fast has reached null of I'll need to set my
        # current pointer to last element as we will be returning that as head
        curr.next = prev
        return curr