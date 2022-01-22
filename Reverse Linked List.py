# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev_ptr=None
        current=head
        next_ptr=head
        
        while current is not None:
            next_ptr=current.next
            current.next=prev_ptr
            prev_ptr=current
            current=next_ptr
        
        return prev_ptr
            
        
# Time complexity: O(n)
# Space complexity: O(1)