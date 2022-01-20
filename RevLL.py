#TimeComplexity:O(n)
#SpaceComplexity:O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No
# Used three pointers to reverse the linked List


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head == None:
            return head
        
        curr = head
        
        prev = None
    
        
        fast = curr.next
        
        while(fast != None):
            
            curr.next = prev
            prev = curr
            curr = fast 
            fast = fast.next
        curr.next = prev
        
        return curr