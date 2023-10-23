 Definition for singly-linked list.
#  class ListNode:
#      def __init__(self, val=0, next=None):
#          self.val = val
#          self.next = next
class Solution:
    """
        NOTES: This is an iterative solution
        Time Complexity: O(n)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes
    
        Any problem you faced while coding this: No

    """
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev
            
