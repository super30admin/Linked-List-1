# Definition for singly-linked list.
# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :no

# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# class Solution:
#     def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
class ListNode:
    def __init__(self,val,next=None):
        self.val=0
        self.next=next
class Solution:
    def reverseList(self,head:Optional[ListNode])-> Optional[ListNode]:
        if not head or head is None:
            return None
        
        curr=head
        prev=None
        fast=head.next
        while fast!=None:
            curr.next=prev
            prev=curr
            curr=fast 
            fast=fast.next
        curr.next=prev    
        return (curr)
