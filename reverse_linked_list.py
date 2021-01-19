# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# Move recursively from start to end with passing current node as prev
# Once we reach last element return the last element through the recursion and attach the 
# prev as next on the way back recursion

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        def helper(prev, current):
            #Terminating condition
            if not current.next:
                current.next = prev
                return current
            
            node = helper(current, current.next)
            
            current.next = prev
            return node
        if not head: return None
        return helper(None, head)