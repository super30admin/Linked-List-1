"""
Intuition: Use 3 pointers: previous, current and fast. Assign current.next = prev and then move all pointers forward.
#####################################################################
Time Complexity : O(N) 
Space Complexity : O(1)
#####################################################################

"""
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        if head == None or head.next == None:
            return head
        prev = None
        curr = head
        fast = head.next
        
        while fast != None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        
        curr.next = prev
        return curr