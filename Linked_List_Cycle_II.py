# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return head
        
        slow,fast = head,head
        hascycle = False
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast :
                hascycle = True
                break
            
        if hascycle == False:
            return None
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
                
            
