# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    """
    TC - O(n)
    SC - O(1)
    """
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None:
            return head
        dum = ListNode(-1)
        dum.next = head
        slow, fast = dum, dum
        cnt = 0
        while cnt <= n:
            fast = fast.next
            cnt += 1
        while fast != None:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return dum.next