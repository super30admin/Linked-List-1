'''Let N be the noncyclic part of the LL and K be the cyclic part of the LinkedList'''

# Time Complexity : O(N + K)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :

# Your code here along with comments explaining your approach

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if not head or not head.next:
            return None

        r = head
        t = head
        
        cycleFound = False
        while r and r.next: 
            r = r.next.next # We handle the head.next not None case. Important in LL Questions.
            t = t.next
            if r == t: # Condition works because we step away from our starting positions already.
                cycleFound = True
                break
        
        if not cycleFound:
            return None
        
        r = head
        while r != t:
            r = r.next
            t = t.next
        
        return r