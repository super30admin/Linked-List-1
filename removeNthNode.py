# Time Complexity : O(n) where n is number of elements in the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head.next:
            return None
        if not head.next.next:
            if n == 1:
                head.next = None
                return head
            elif n == 2:
                return head.next
        # find the length of the list
        current = head
        length = 0
        while current:
            length += 1
            current = current.next
        # edge case
        if length == n:
            return head.next
        # using two pointers
        slow = head
        fast = head.next
        for i in range(length - n - 1):
            slow = fast
            fast = fast.next
        # remove nth to last node
        slow.next = fast.next
        fast.next = None
        return head
