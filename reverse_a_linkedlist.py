class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        prev = None
        curr = head 
        next_ = None
        while curr:
            next_ = curr.next
            curr.next = prev
            prev = curr
            curr = next_
        #head = curr 
        return prev
