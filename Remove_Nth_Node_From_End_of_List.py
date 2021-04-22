# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # Attach a dummy, point slow and fast to dummy
        dummy = ListNode(0,head)
        slow, fast = dummy, dummy
        
        # Advance fast pointer by n steps
        while n:
            fast = fast.next
            n -= 1      
        
        # Advance slow and fast till fast reaches end. 
        # Slow should be pointing to n+1 from end at this point
        while fast.next:
            slow = slow.next
            fast = fast.next
        
        # Remove the nth node from end
        slow.next = slow.next.next
        
        # Return head
        return dummy.next
        

### Complexity Analysis ###

# Time Complexity: O(N) --> Traversing N nodes of the list
# Space Complexity: O(1) --> Constant space occupied by slow and fast