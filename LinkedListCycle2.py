class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        fast=head
        slow=head
        
        while fast is not None and fast.next is not None:
            fast=fast.next.next
            slow=slow.next
            
            if fast==slow:
                break
        
        if fast is None or fast.next is None:
            return None
        
        fast=head
        
        while fast!=slow:
            fast=fast.next
            slow=slow.next
            
        return fast

# Time complexity: O(n) as we are traversing all elements in a linked list
# Space complxity: O(1) as we are only using pointers and not auxillary space