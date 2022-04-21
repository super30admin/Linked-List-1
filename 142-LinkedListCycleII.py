#Time Complexity : O(n) 
# Space Complexity : O(1) as we are using only pointers
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head == None:
            return None
        slow = head
        fast = head
        hasCycle = False
        while (fast.next != None and fast.next.next != None):
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break
        if hasCycle == False:
            return None
        else:
            slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
        