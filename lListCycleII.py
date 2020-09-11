# // Time Complexity : O(n)
# // Space Complexity : O(n), additional space taken by set
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach

#Done before discussed in class
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        #maintain a set of visited nodes
        visited = set()
        
        while head is not None:
            #if the head is in visited set, return head
            if head in visited:
                return head
            #else, add the head and move the to the next node
            else:
                visited.add(head)
                head = head.next
        
        return None
            
        
        
        