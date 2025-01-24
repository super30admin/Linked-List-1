# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # TC : O(n)
        # SC : O(1)
        if head is None:
            return None
        if n == 0:
            return head
        
        dummy = ListNode(-1)
        dummy.next = head
        slow,fast = dummy,dummy
        ct = 0
        while ct <=n:
            ct += 1
            fast = fast.next
        while fast != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next