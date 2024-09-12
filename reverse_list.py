# // Time Complexity :O(n) 
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach





# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None :
            return None
        if head.next==None:
            return head
        prev=None
        current=head
        last=current.next
        while current.next:
            current.next=prev
            prev=current
            current=last
            last=last.next
        current.next=prev
        head=current
        return head
            
        