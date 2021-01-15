# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Initialize a dummy node to None. Assign prev to dummy.
# Iterare over the linkedlist until it reaches the end
# Point the next of head to prev and prev to head and head to new head that is currentNode
# And currentNode becomes currentNode.next. Once the prev reaches the end the linkedlist is reversed.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return None
        dummy = None
        prev = dummy
        while head:
            currentNode = head.next
            head.next = prev
            prev = head
            head = currentNode
        return prev