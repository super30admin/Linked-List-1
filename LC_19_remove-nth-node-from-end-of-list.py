# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
       
        for _ in range(n):
            fast = fast.next
        
        while(fast and fast.next):
            slow = slow.next
            fast = fast.next
            
        # print(slow.next)
        # print(fast)
        slow.next = slow.next.next
        
        if slow == dummy:
            return slow.next
        else: