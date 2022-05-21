'''
Time Complexity : 0(n)
Space Complexity : 0(n) -- recursion
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
    
    def reverseLinkedList(self,head,prev,temp):
        # base
        if head == None:
            
            head = prev
            prev= None
            temp = None
            
            return head
        
        # logic
        prev = head
        head = head.next
        prev.next = temp
        temp = prev
        
        # recursive call
        # stack.push --> abandon the parent
        return self.reverseLinkedList(head,prev,temp)
    
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        return self.reverseLinkedList(head,None,None)