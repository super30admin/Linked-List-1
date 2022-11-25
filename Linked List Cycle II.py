class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if not head:
            return None
        
        slow = head
        fast = head
        cycle = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                cycle = True
                break
            
        if not cycle:
            return None
        
        fast = head
        
        while slow != fast:
            slow = slow.next
            fast = fast.next
            
        return fast
