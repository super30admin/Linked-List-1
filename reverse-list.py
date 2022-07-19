"""
Runtime Complexity:
O(n) - we traverse 'n' nodes in the list in order to reverse the list.
Space Complexity:
O(1) - no extra space required to compute the solution.
Yes, the code worked on leetcode.
"""
#Recursive Approach
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        
        reversed_list = self.reverseList(head.next)
        head.next.next  = head
        head.next = None
        return reversed_list

#Iterative version
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        
        prev  = None
        curr = head
        fast = head.next
        
        while fast!=None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr
            
            
        
        