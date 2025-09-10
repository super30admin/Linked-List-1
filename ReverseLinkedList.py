# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# The intuition is to have 3 pointers in total to reverse the pointers with prev current and temp.

# Also can be done through recursion as well

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while (curr != None):
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev

    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head

        new_head = self.reverseList(head.next)

        head.next.next = head
        head.next = None

        return new_head