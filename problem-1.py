# Leetcode Execution:YES
# Time Complexity:O(n)
# Space Complexity:O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    
#     we iterate through the linked list and keep temp.next in curr and change temp.next to prev  and then we move prev to current temp and move temp to curr finally we update head.next to None and head to prev
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None:
            return
        temp=head.next
        prev=head
    
        while(temp!=None):
            curr=temp.next
            temp.next=prev
            prev=temp
            temp=curr
        head.next=None
        head=prev
        return head
        
            
            
            
        