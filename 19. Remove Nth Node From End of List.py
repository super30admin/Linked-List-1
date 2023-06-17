#Time and Space complexity : O(N), O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        slow = head
        fast = head
        if(head.next is None or head is None):
            return None
        while (n>0):
            fast = fast.next
            n-=1
        if fast is None:
            return head.next
        while(fast.next!=None):
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return head
    