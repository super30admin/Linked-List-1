# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        if head is None:
            return None
        
        curr = head
        fast = curr.next
        prev = None
        
        
        while fast is not None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        
        curr.next = prev
        
        return curr
    
#      3 pointer approach to reverse linkedList..O(n) is time complexity and O(1) is 
