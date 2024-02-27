class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # curr = head
        # prev = None
        # while curr:
        #     nxt = curr.next
        #     curr.next = prev
        #     prev = curr
        #     curr = nxt
        
        # return prev
        if not head:
            return
        if not head.next:
            return head
        
        reversedEnd = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reversedEnd
