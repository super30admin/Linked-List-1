# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        first = head
        if(first.next == None):
            return None
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        
        while(count<=n):
            count += 1
            fast = fast.next
        while(fast!=None):
            slow = slow.next
            fast = fast.next
        if(head == slow.next):
            head = slow.next.next
            slow.next = slow.next.next
        slow.next = slow.next.next
        return head