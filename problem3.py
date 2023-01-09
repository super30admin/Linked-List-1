#time complexity: O(n)
#space complexity: O(1)
#ran on leetcode: Yes
#have 2 pointers, fast and slow. Move fast ponter by 2 odes and slow pointer by one node. When these 2 become equal we have deteced a cycle. Now again initialise pointer p1 from head and pointer p2 from this intersection. Move p1 and p2 by one node ntil they ntersect. This intersection is where the cycle starts.
# previous will be the head of reversed linked list.
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        fast=head
        slow=head
        while(fast):
            fast=fast.next
            if(fast==None):
                return None
            
            fast=fast.next    
            slow=slow.next
            if(fast==slow):
                break
        if(fast==None):
            return None
        p1=head
        p2=slow
        while(p1!=p2):
            p1=p1.next
            p2=p2.next
        return p1
        

        
            
            
        return None
