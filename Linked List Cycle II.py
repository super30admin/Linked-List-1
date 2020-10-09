# Time Complexity : O(N)
# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head):
        fast = slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            # if there is a cycle
            if slow is fast:
                # the head and slow nodes move step by step
                while head:
                    if head == slow:
                        return head
                    head = head.next
                    slow = slow.next
        return None