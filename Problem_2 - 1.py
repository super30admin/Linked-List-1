"""
Two Pass Algorithm 
Time Complexity : O(n)
Space Complexity : O(1)
    
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head:
            return head
        
        cur = head 
        count = 0
        
        while cur:
            count += 1 
            cur = cur.next
        if count == 1:
            return None 
        
        del_node = count - n 
        if del_node == 0:
            head = head.next 
            return head 
        
        cur = head 
        while del_node-1:
            cur = cur.next 
            del_node -= 1 
        
        cur.next = cur.next.next 
        return head 
            
            
            