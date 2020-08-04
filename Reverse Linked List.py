# Time Complexity : O(n) where n is the number of nodes
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# We set Prev = Null node and we iterate through each node from head and assign
# temp  = current.next
# current.next = previous
# previous = current
# current = temp

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None

        while head is not None:
            nexthead = head.next
            head.next = prev
            prev = head
            head = nexthead

        return prev






