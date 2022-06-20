# time complexity is o(n), where n is the size of the input
# sapce complexity is o(1).
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if(head == None or head.next == None):
            return None
        slow = head
        fast = head
        while(fast.next != None and fast.next.next != None):
            slow = slow.next
            fast = fast.next.next
            if(fast == slow):
                break
        if(fast.next == None or fast.next.next == None):
            return None
        slow = head
        while(fast != slow):
            slow = slow.next
            fast = fast.next
        return slow
            
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
#         if(not head or head.next == None):
#             return None
#         flag = False
#         slow = head
#         fast = head
#         while(fast != None and fast.next != None):
#             fast = fast.next.next
#             slow = slow.next
#             if(fast == slow):
#                 flag = True
#                 break
#         if(not flag):
#             return None
#         slow = head
#         while(slow != fast):
#             slow = slow.next
#             fast = fast.next
#         return slow
            
            
        