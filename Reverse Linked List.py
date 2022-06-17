# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

"""
TC: O(n)
SC: O(1)
"""
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if not head :
            return
        
        curr = head
        prev = None
        
        while curr:
            next_ = curr.next
            curr.next = prev
            prev = curr
            curr = next_
        
        return prev
        
