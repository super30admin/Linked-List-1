# 19. Remove Nth Node From End of List
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count = 0
        curr = head

        while curr is not None:
            curr = curr.next
            count += 1

        prev = head
        if count-n-1 < 0:
            head = prev.next
            prev.next = None
            return head
        
        for i in range(count-n-1):
            prev = prev.next

        prev.next = prev.next.next

        return head



        
        