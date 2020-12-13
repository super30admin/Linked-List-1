# Remove Nth Node From End of List

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes with Runtime: 36 ms and Memory Usage: 14.2 MB
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach : 
"""
Using one pass first_head and second_head pointing to head and iterating.

"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:    
        first_head =second_head= head
        
        for i in range(n):
            second_head = second_head.next 
            
        if second_head == None:
            return first_head.next
        
        while second_head.next != None:
            second_head = second_head.next
            first_head = first_head.next
            
        first_head.next = first_head.next.next
        return head