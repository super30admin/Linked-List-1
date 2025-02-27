"""
## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
"""


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Using three pointers
        TC: O(n)
        SC: O(1)
        """
        if not head: return head
        
        curr = head
        prev  = None
        #prev.next = curr
        
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
            
        return prev


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Using Recursion
        TC: O(n)
        SC: O(n)
        """
        # Base Case
        if head == None or head.next == None: return head
        
        # Logic
        rev  = self.reverseList(head.next)
        
        
        head.next.next = head
        head.next = None
        
        return rev
               
            
        