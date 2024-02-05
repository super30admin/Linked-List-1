
#Time complexity: O(N)
#Space complexity: O(1)

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        
        slow = head
        fast = head
        hasCycle = False

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break

        if not hasCycle:
            return None

        slow = head
        while fast != slow:
            slow = slow.next
            fast = fast.next
        return slow

            
        