# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr is not None:
            # path forward is set up using temp
            temp = curr.next
            # point current to prev
            curr.next = prev
            # move prev forward
            prev = curr
            # move curr to the temp to continue processing
            curr = temp
        # curr is now None, hence prev is head
        return prev


# Time Complexity : O(n)
# Space Complexity : O(n) [Stack space]
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Recursive approach
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Recursive approach
        # Base Condition
        if head is None or head.next is None:
            return head
        # assume all nodes in front are reversed
        new_head = self.reverseList(head.next)
        # next node would now point to null due to above
        #make it point to head
        head.next.next = head
        #head should point to null
        head.next = None
        return new_head
        
            