#Time complexity O(n), space O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
              
        s=f=head
#Maintaining two pointers to find the node where cycle starts    
        while f and f.next:
            s=s.next
            f=f.next.next
            
            if s == f:
                break
                
        if f == None or f.next==None:
            return None
        
        s=head
        while s!=f:
            s=s.next
            f=f.next
            
        return s
