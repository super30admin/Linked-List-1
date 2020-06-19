# Time Complexity : Add - O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. I have used an 3 pointers to keep track of Prev, Current and Forward(current.next) nodes
2. Then changing the connection of current.next to Prev, and moving forward
'''

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        if head is None:
            return
        
        prev = None
        current = head
        forward = current.next
        
        while current:
            current.next = prev
            prev = current
            current = forward
            if forward:
                forward = forward.next
            
        head = prev
            
        return head
            