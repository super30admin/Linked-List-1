# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head or head.next is None:
            return None
        
        slow = head
        fast = head
        
        while fast and fast.next:
            slow = slow.next
            fast =fast.next.next
            
            if slow == fast:
                p1 =head
                while p1!=slow:
                    p1 = p1.next
                    slow = slow.next
                    
                return slow
            
        return None
        
        
        