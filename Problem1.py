# Definition for singly-linked list.

"""

    Student : Shahreen Shahjahan Psyche
    Time : O(N)
    Space : O(1)

    This code ran successfully for all the test cases in Leetcode

"""
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        # edge case
        if head is None:
            return
        # edge case
        if head.next is None:
            return head
        
        prev = head
        curr = None
        
        # changing the pointer to the reverse direction
        while(prev!=None):
            
            temp = prev.next
            prev.next = curr
            curr = prev
            prev = temp
            
            
        
        return curr