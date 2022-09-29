# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None: return None
        prev = head
        curr = head.next 
        if curr is None: return prev
        fast = head.next.next
        
        prev.next = None
        while fast is not None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr