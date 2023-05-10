class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return head
        curr = head
        prev = None
        ahead = curr.next
        while curr != None:
            curr.next = prev
            prev = curr
            curr = ahead
            if ahead != None:
                ahead = ahead.next
        return prev