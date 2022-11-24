# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

'''
Time complexity -->
O(n)

Space Complexity -->
O(1) since we are not using any extra memory space
'''
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        length = 0
        curr = head
        while curr:
            length+=1
            curr = curr.next
        #O(n)
        if length == n:
            head = head.next
            return head
        target = length - n
        curr = head
        while target!=1:   # O(n)
            
            target-=1
            curr = curr.next
        
        curr.next = curr.next.next
        return head
            
        
        
        
        