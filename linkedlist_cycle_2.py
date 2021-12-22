class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return 
        def getIntersection(head):
            slow = head 
            fast =  head
            while fast and fast.next  :
                slow = slow.next 
                fast = fast.next.next 
                if fast == slow:
                    return slow 
            return None
        intersection = getIntersection(head)
        if not intersection or not head.next:
            return None
        ptr1 = head 
        ptr2 = intersection
        while ptr1 != ptr2:
            ptr1 = ptr1.next
            ptr2 = ptr2.next
        return ptr1
        
        
        
