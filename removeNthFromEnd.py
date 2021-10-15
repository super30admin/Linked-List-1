'''
Time Complexity: nth element O(k) + len of linked list O(n)
Space Complexity: O(1)

'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: m
        fast=head
        for i in range(n):
            fast=fast.next
        while fast:
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return prev.next
            
            
        