'''
Approach
--------
We maintain 2 pointers and move the right pointer 1st n steps. Then we move both pointers simultaneouly until we reach end of the list and the gap between them will always be n. Thus once we reach end of the list on right pointer we move the left pointer next to point to left.next.next


Complexity Analysis
-------------------
Tc = O(n) #we have to travel the entire list once atleast for right pointer
SC= O(1) #since we are not storing anything


'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:\
        
        if not head:
            return
        
        dummy = ListNode(0, head)
        left = dummy
        right = head
        
        
        while(n>0):
            right = right.next
            n -= 1
            
        while(right!= None):
            right = right.next
            left = left.next
            
        left.next = left.next.next 
        
        return dummy.next  