# Time Complexity : O(N) since it's one pass
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
        #Base case
        if not head:
            return None
        
        # using 3 - Pointer
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
        
        
# Recursion 
# Time complexity : O(N) 
# Space complexity : O(N)
def reverseList(self, head: ListNode) -> ListNode:
          if not head or not head.next:
                return head
          # Recursive call
          new_head = self.reverseList(head.next)
          head.next.next = head
          head.next = None
            
          return new_head
