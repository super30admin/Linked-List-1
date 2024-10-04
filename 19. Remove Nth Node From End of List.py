# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

### T(C) -- O(n)
### S(C) -- O(1)


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        dummy = ListNode(0,head)
        prev = dummy
        curr = head

        while curr and n > 0:
            curr = curr.next
            n -= 1

        while curr:
            curr = curr.next
            prev = prev.next
        
        if not curr:
            temp = prev.next.next
            prev.next.next = None
            prev.next = temp
            
        return dummy.next





            
        
