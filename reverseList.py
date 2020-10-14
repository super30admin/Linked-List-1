# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return head
        #if head.next == None:
        #   return head

        
        p1 = head
        p2 = head.next
        head.next = None

        while p2:
            temp = p2.next
            p2.next = p1
            p1 = p2
            p2 = temp
            
            
        return p1