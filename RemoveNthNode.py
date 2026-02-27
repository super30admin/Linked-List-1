# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : Move fast pointer n + 1 steps ahead so it leads the slow by n nodes.
# Then increment both together until fast hits the end — now slow is right before the target.
# Skip the node to be removed and clean up the reference.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        slow, fast = dummy, dummy

        for i in range(n+1):
            fast = fast.next

        while fast is not None:
            slow = slow.next
            fast = fast.next

        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        return dummy.next
        