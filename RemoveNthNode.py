# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# The intuition here is to have slow and fast pointer(gap with slow should be equal to n) and slow should point
# one step back to the node to be deleted and then use the pointers to update slow.next to slow.next.next

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1, head)
        slow = dummy
        fast = dummy
        count = 0
        while (count < n):
            fast = fast.next
            count += 1
        while (fast.next != None):
            slow = slow.next
            fast = fast.next

        temp = slow.next
        slow.next = temp.next
        temp.next = None

        return dummy.next