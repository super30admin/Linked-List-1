# Time Complexity : Add - O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. I have used an auxillary stack where I put each node as I iterate through.
2. Thrn popping it out and putting the connetcions using a  dummy variable
'''


from collections import deque
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        if head is None:
            return
        
        stack = deque()     
        current = head
        while current:
            stack.append(current)
            current = current.next
  
        if stack:
            head = stack[-1]
            
        dummy = ListNode()
        while stack:
            
            popped_node = stack.pop()
            popped_node.next = None
            dummy.next = popped_node
            dummy = dummy.next
        
        del dummy
        return head