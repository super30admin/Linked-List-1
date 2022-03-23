#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : YES
#Any problem you faced while coding this : NO



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        first = None
        second = head
        
        while second!=None:
            temp = second.next
            print(temp)
            second.next = first
            first = second
            second = temp
            
        return first

            
        
            