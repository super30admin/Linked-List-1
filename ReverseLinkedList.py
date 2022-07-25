# Time Complexity : O(N)  //because every element is linked list is visited once.
#  Space Complexity : O(1)  //It doesnt use any extra variables
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #Declare variables to make list reverse like a temp iterate till the list gets reversed
        prev = None
        current = head
        while (current is not None):
            #Store next
            next = current.next
            #Curr element's next is set to head of reversed list till now
            current.next = prev
            #Make curr element head of reversed list
            prev = current
            #Update curr element to our next element in linked list
            current = next
        return prev
