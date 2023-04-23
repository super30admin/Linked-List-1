'''
Approach
--------
Using Floyd-Warshall's cycle detection Algorithm

Complexity Analysis
-------------------
Tc = O(n) #we have to travel the entire list once atleast for right pointer
SC= O(1) #since we are not storing anything


'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def isCycle(self, head):
        fast, slow = head, head;
        
        while((fast and slow) and fast.next != None):
            fast = fast.next.next
            slow = slow.next
            
            if fast == slow:
                slow = head
                while(fast != slow):
                    fast = fast.next
                    slow = slow.next
                
                return slow
        
        return None
    
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None or head.next==None:
            return None
        
        return self.isCycle(head)
        
        