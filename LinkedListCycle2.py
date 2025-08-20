# Time Complexity : It is O(n) since we are iterating with all nodes.
# Space Complexity : It is O(n) considering all the leaves of the nodes can be in the queue.
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head ==None or head.next == None:
            return None
        slow= head
        fast = head
    
        isCycle = False

        
        while(fast !=None and fast.next !=None):

            slow = slow.next
            fast = fast.next.next
            if slow==fast:
                isCycle = True
                break
        if isCycle == False:
            return None

        fast=head
        if slow==fast:
            return slow
        while(slow !=fast):  
            slow = slow.next   
            fast = fast.next 
        return slow
