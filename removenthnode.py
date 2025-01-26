# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head.next ==None:
            return None
        dummy =ListNode(-1)
        slow = dummy
        fast = dummy
        dummy.next = head
        for i in range(n+1):
            fast=fast.next
        while fast:
            slow=slow.next
            fast=fast.next
        if slow.next:
            slow.next = slow.next.next
        return dummy.next

        
        