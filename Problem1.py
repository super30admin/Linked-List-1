#Time Complexity :O(n)
#Space Complexity :O(1) 
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None or head.next==None:
            return head
        reverse=self.reverseList(head.next)
        head.next.next=head
        head.next=None
        return reverse
        
        #prev=None
        #curr=head
        #while curr!=None:
        #    temp=curr.next
        #    curr.next=prev
        #    prev=curr
        #    curr=temp
        #return prev

        
