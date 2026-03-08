# problem 2 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        temp_head = ListNode(-1)
        temp_head.next = head
        slow_ptr = temp_head
        fast_ptr = temp_head
        for _ in range(n+1):
            fast_ptr = fast_ptr.next
        while(fast_ptr):
            fast_ptr = fast_ptr.next
            slow_ptr = slow_ptr.next
        slow_ptr.next = slow_ptr.next.next 
        return temp_head.next