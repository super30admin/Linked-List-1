# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this : No

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        # create a set to find the cycle start
        visited = set()
        cur = head
        
        while cur:
            
            # if the node is present, it is the cycle's start node
            if cur in visited:
                return cur
            
            # add nodes to the set
            else:  
                visited.add(cur)
                cur = cur.next
                
        return None