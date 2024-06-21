# Time O(N)
# Space O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None:
            return None
        dummy = ListNode(-1)
        dummy.next = head 
        slow = dummy
        fast = dummy
        count = 0 
        while count <= n:
            count += 1
            fast = fast.next
        while fast:
            fast = fast.next 
            slow = slow.next
        slow.next = slow.next.next 

        return dummy.next
        