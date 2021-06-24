# Time Complexity: O(n)
# Space Complexity: O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        # Two pointer approach
        fast = head
        slow = head
        count = 0
        
        # To create a difference of n between the fast and slow pointers
        while (count < n):
            fast = fast.next
            count += 1
        
        # To check edge cases like empty list and one element linked list
        if fast is None:
            return head.next
        
        # Keep moving fast and slow as long as fast.next exists (till the end of the list)
        while fast.next:
            fast = fast.next
            slow = slow.next
        
        # Once the fast reaches the end of the list, make the slow.next point towards the next value and remove the node in between
        slow.next = slow.next.next
        
        # Return the head
        return head
        
        
            
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        