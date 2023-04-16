# Time Complexity : O(n) because we are traversing the linked list once
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
This problem is solved by using two trackers, both n apart. Then we send the fast pointer to the end of the linked list 
and then set the next of the slow pointer to next.next.
"""


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None:
            return head

        dummy = ListNode(-1)
        dummy.next = head

        slow = dummy
        fast = dummy

        for _ in range(n + 1):
            fast = fast.next

        while fast != None:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next

        return dummy.next