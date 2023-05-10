class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        fast, slow = head, head
        iscycle = False
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                iscycle = True
                break
        if not iscycle:
            return None
        fast = head
        while fast != slow:
            slow = slow.next
            fast = fast.next
        return slow