#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        flag = 0
        fast = head
        slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            
            if fast == slow:
                flag = 1
                break
        if flag == 0:
            return None
        
        slow = head
        
        while slow!=fast:
            slow = slow.next
            fast = fast.next
            
        return slow
        
                