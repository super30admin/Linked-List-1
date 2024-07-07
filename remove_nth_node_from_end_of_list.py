"""
Linked-List-1
Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Trick is to use slow/fast pointer and traverse until the current count is more than the n. Once we set the fast pointer here
now we'll start with the slow pointer and traverse until fast reaches at end and now we connect it's next to next.
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return []

        count = 0
        dummy = ListNode(-1)
        dummy.next = head
        fast = dummy
        slow = dummy

        while count <= n:
            fast = fast.next
            count += 1

        while fast is not None:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        return dummy.next
        