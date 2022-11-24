# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No probelm at all 
# Your code here along with comments explaining your approach: Iterative

from typing import ListNode
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev, current = None, head

        while current:
            next = current.next
            current.next = prev
            prev = current
            current = next
        return prev


# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No probelm at all 
# Your code here along with comments explaining your approach: Recursive

from typing import ListNode
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # base case
        if not head:
            return None

        newHead = head
        if head.next:
            newHead = self.reverseList(head.next)
            head.next.next = head
        head.next = None

        return newHead
