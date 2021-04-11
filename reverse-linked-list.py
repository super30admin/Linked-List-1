# Time Complexity : O(n), where n is the number of nodes
# Space Complexity : O(1)/ O(n) for iterative/recursive approach
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:

        if head is None:
            return head

        prev = None
        curr = head
        fast = head.next

        while fast is not None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next

        curr.next = prev

        return curr


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None or head.next is None:
            return head

        node = self.reverseList(head.next)

        head.next.next = head
        head.next = None

        return node
