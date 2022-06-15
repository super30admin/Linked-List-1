# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    
    def getCommon(self, head):
        # fast adn slow pointers
        fast = head
        slow = head
        
        while fast and fast.next:
            slow  = slow.next
            fast = fast.next.next
            if slow == fast :
                return slow
            
        return None
        
    
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        # basecase
        if head is None:
            return None
        
        common = self.getCommon(head)
        if common is None:
            return None
        
        ptr1 = head
        ptr2 = common
        
        while ptr1!=ptr2:
            ptr1 = ptr1.next
            ptr2 = ptr2.next
            
        return ptr1
            
        
#         time - o(n)
#         space - o(1)
        
        