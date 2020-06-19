# Time Complexity : Add - O(n)
# Space Complexity :O(h)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. I have used recursion to hold the nodes in recusrive stack, except for the tail element, which swould
   be the head
2. As the elements from stack are popped, the connections between node are made through
        head.next.next = head
        head.next = None
'''

class Solution:
    global_head = None
    def reverseList(self, head: ListNode) -> ListNode:
        
        self._helper(head)
        
        if self.global_head:
            return self.global_head
        return head
        
        
    def _helper(self, head):
        
        if head is None or head.next is None:
            self.global_head = head
            return
        
        self._helper(head.next)
        print (head.val)
        head.next.next = head
        head.next = None