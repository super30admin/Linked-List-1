# Time Complexity = O(n)
# Space Complexity = O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # If no or only 11 node present
        if head == None or head.next == None:
            return head
        
        
        # Initialising 3 pointers
        prev = None
        curr = head
        fast = head.next
        
        # Boundary condition
        while(fast != None):
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        
        # As soon as fast == None, reverse the remaining last node
        curr.next = prev
        
        # Contains head of the reversed LL
        return curr
  
  
  
    '''  
    # Recursive code
    # TC = O(n)
    # SC = O(n)
    
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # If no or only 11 node present
        if head == None or head.next == None:
            return head
        
        
        reverse = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reverse
        
        
    '''