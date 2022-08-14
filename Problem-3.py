#  142. Linked List Cycle II
'''
Leetcode all test cases passed: Yes
Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        n is the no of nodes in the linked list 
        Space Complexity: O(1)
        Time Complexity: O(n)
'''
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        cycle_detected = False
        while fast != None and fast.next != None:
            
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                cycle_detected = True
                break
        
        if cycle_detected == False:
            return None

        fast = head
        while slow != fast:
            fast = fast.next
            slow = slow.next
        
        return slow
