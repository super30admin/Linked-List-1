# Three pointer approach

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head is None:
            return None
        
        prev = None
        curr = head
        fast = head.next
        
        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
            
        curr.next = prev
        
        return curr
    
    # This is intuitive solution without using any space
    # Time Complexity: O(n)
    # Space Complexity: O(1) because no extra space used