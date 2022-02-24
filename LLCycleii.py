# TC : O(n)
# SC : O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = fast = head
        
        while(fast and fast.next):
            slow = slow.next
            fast = fast.next.next
            
            if(fast == slow):
                break
            
        #fast is invalid means where there is no cycle
        if (not fast or not fast.next):
            return None
        
        #when fast and slow meets whe have to find cycle starting point from head
        slow = head
        while(slow != fast):
            slow = slow.next
            fast = fast.next
            
        return slow
