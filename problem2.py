# time O(n) | space O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return None

        dummy = ListNode(0)
        dummy.next = head
        slow=fast=dummy

        for _ in range(n):
            fast = fast.next
        
        # now slow and fast pointers has "n" distance gap

        while fast.next:
            slow = slow.next
            fast = fast.next
        
        # now slow is before the node we want to remove
        slow.next = slow.next.next

        return dummy.next