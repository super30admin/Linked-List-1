'''
TC: O(n)
SC: O(1)

Intuition: Sliding Window
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        if not head:
            return head
        
        c = 0
        fakehead = ListNode(0)
        fakehead.next = head
        p1, p2 = fakehead, fakehead
        
        
        while c < n:
            p2 = p2.next
            c += 1
            
        while p2 and p2.next:
            p2 = p2.next
            p1 = p1.next
        
        p1.next = p1.next.next
        
        return fakehead.next   
        