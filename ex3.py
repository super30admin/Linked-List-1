# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Find meeting point (if any)
        slow = fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next 
            
            # cycle detected
            if slow == fast: break
        
        else: return None

        # reset slow pointer so slow and fast meet at cycle entry
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next

        return fast
