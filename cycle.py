class Solution:

    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return None
        
        slow, fast = head, head
        
        while fast is not None and fast.next is not None:
            slow, fast = slow.next, fast.next.next
            if slow == fast:
                break
        #no cycle     
        if slow != fast:
            return None
        
        #psas 2
        slow = head
        
        while slow != fast:
            slow, fast = slow.next, fast.next
            
            
        return slow

#space - O(1)
#Time -O(n) two pass