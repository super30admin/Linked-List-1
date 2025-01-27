# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        # set fast to optimal position
        fast = head
        distance = n

        while distance != 0:
            fast = fast.next
            distance -= 1
        
        # now initialize slow (i.e. to delete) pointer at the optimal node 
        slow = head
        prev = None

        while fast != None:
            prev = slow
            slow = slow.next
            fast = fast.next
        
        
        if slow == head:
            # base-case 
            # slow is at head
            head = head.next
            slow.next = None
            slow = None
        
        else:
            # logic-case
            # slow is to-delete pointer, update the pointers
            prev.next = slow.next
            slow.next = None
            
            # avoid dangling pointers situation
            slow = None
            prev = None

        return head
        