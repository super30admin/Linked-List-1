# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Initialize prev to None.
# Set the currentNode to head.next
# Point the next of head to prev and prev to head and head to currentNode
# Once the prev reaches the end the linkedlist is reversed return prev.


class Solution:
    def reverseList(self, head: ListNode | None) -> ListNode | None:
        if not head:
            return None
        prev = None
        while head:
            currentNode = head.next
            head.next = prev
            prev = head
            head = currentNode

        return prev
