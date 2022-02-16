class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return None
        
        slow = head
        fast = head
        flag = False
        
        while(fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            
            if fast == slow:
                flag = True
                break
                
        if not flag:
            return None
        fast = head
        while(fast != slow):
            fast = fast.next
            slow = slow.next
        
        return slow