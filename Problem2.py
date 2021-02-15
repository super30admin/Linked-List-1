# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
"""
19. Remove Nth Node From End of List
Time Complexity - O(n)
Space Conplexity - O(1)
"""
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(-1)
        dummy.next = head
        
        p1 = p2 = dummy
        "Moving pointer p1 to n distance from start,so that by the time p1 reaches NULL p1 will reach node prior to deleting node"
        while(n > 0):
            p1 = p1.next
            n -= 1 
        
        "time p1 reaches NULL p1 will reach node prior to deleting node"    
        while p1.next != None:
            p1 = p1.next
            p2 = p2.next
            
        "Deleting Nth node"    
        p2.next = p2.next.next
        return dummy.next