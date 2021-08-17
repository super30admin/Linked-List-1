"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return head
        # Taking dummy varibale to be able to handle the case when we need
        # to delete the first node
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        # Increment fast pointer till it reached count equal n
        while count <= n:
            fast = fast.next
            count += 1
        # After fast pointer reaches end increment slow pointer
        while fast != None:
            fast = fast.next
            slow = slow.next
        # Now we've reached the correct position so unlink and delete
        slow.next = slow.next.next
        return dummy.next