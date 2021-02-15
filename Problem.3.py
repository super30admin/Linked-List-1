"""142. Linked List Cycle II
Time Complexity - O(n)
Space Complexity - O(1)
Here slow and fast pointer concept is used to first find if the list is has cycle in it or not
If cycle is present dummy variable is initialized to head and the point at which slow and dummy variable meets will be start point of cycle"""
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = fast = head
        
        while (fast.next != None and fast.next.next != None):
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                dummy = head
                while slow != dummy:
                    dummy = dummy.next
                    slow = slow.next
                return slow
        return None
                