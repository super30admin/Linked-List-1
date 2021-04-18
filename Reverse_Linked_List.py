# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        if not head:
            return
        
        prev = None
        current = head
        fast = head.next
        
        while fast :
            current.next = prev
            prev = current
            current = fast
            fast = fast.next            
            
        current.next = prev
        return current
