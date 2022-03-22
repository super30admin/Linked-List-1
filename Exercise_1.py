 
    # 142. Linked List Cycle II

    # Time Complexity : O(n)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this : No


class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        slow = head
        fast = head
        flag = False
        
        while(fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag=True
                break
                
        if not flag:
            return None
        
        slow = head
        
        while(fast!=slow):
            fast = fast.next
            slow = slow.next
        return slow
            
        