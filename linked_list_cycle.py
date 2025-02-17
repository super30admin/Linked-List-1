class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        slow = head
        fast = head
        hasCycle = False
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break
        if hasCycle == False:
            return None
        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
    
# Time complexity - O(n)
# Space complexity - O(1)