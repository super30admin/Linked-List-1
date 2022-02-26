# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this : No

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        size = 1
        
        # two heads
        cur = p = head
        
        # until end of the list
        while cur.next:
            
            size += 1
            cur = cur.next
            
            # to start p head after cur head passes n elements
            if size > n + 1:
                p = p.next
               
        # if only n elements present
        if size == n:   
            return head.next
        
        else:        
            p.next = p.next.next
            return head