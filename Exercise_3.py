 
    # 206. Reverse Linked List

    # Time Complexity : O(n)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this : No

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
        # Iterative
        
        prev = None
        curr = head
        while curr!=None:
            Temp = curr.next
            curr.next = prev 
            prev = curr
            curr = Temp
        return prev
    
        # Recursive

    # Time Complexity : O(n)
    # Space Complexity : O(n)
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this : No

         
        if not head or not head.next:
            return head
        p = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return p
    
    