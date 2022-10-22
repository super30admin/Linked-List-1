class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head is None:
            return None
        
        intersect = self.intersectCycle(head)
        
        if intersect == None:
            return None
        
        p1 = head
        p2 = intersect
        
        while p1 != p2:
            p1 = p1.next
            p2 = p2.next
            
        return p1
        
        
    def intersectCycle(self,head):
        
        slow = head
        fast = head
        
        while fast != None and fast.next != None:
            
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return fast
        
        return None
    
    # Again this is floyd algorithm
    # Time Complexity: O(n)
    # Space Complexity: O(1) because no extra space is used