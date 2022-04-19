# Time complexity -> O(n)
# Space complexity -> O(1)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        
        slow = fast = head
        hasCycle = False
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break
                
        if not hasCycle:
            return None
        
        while head != fast:
            head = head.next
            fast = fast.next
            
        return head