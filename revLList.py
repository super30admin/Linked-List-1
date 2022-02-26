# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this : No

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        prev_node = None
        curr_node = head
        while curr_node:
            
            # Remember next node
            next_node = curr_node.next 
            
            # REVERSE! None, first time round.
            curr_node.next = prev_node  
            
            # Used in the next iteration.
            prev_node = curr_node 
            
            # Move to next node.
            curr_node = next_node  
        
        # assign prev_node as head
        head = prev_node
        
        return head