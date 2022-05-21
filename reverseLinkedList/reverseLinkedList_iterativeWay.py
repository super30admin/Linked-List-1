'''
Time Complexity : 0(n)
Space Complexity : None
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head == None:
            return head
        
        temp = None
        previous = None
        
        while head.next != None:
            
            previous = head
            head = head.next
            previous.next = temp
            temp = previous
            
            continue
        
        # Update head.next to previous
        head.next = previous
        
        previous = None
        temp = None
        
        
        return head