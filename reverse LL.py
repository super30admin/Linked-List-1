# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

#iterative
#Tc: O(n)
#SC: O(1)
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        curr = head
        while curr:
            next_temp = curr.next
            curr.next = prev
            prev = curr
            curr = next_temp
            
        return prev
 
#recursive
#Tc: O(n)
#SC: O(n)
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return head
        
        if head and not head.next:
            return head
        
        p = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return p
    
    
# def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
#     def reverseRec(curr, prev):
#         # Base Condition
#         if curr is None:
#             head = prev 
#             return head 
#         temp = curr.next 
#         curr.next = prev
#         return reverseRec(temp, curr)

#     return reverseRec(head, None) 