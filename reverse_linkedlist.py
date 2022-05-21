# Time Complexity : O(N) where N is number of nodes in the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        tail = None
        curr = head
        face = head.next
        
        while curr.next is not None:
            curr.next = tail
            tail = curr
            curr = face
            face = face.next
            
        curr.next = tail
        
        return curr