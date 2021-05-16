# TC: O(N) where N is the size of the linked list
# SC: O(1) since we are not using any extra space

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        cycle = False
        
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next 
            if slow == fast:
                cycle = True
                break
        
        if not cycle:
            return 
        
        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        
        return slow
