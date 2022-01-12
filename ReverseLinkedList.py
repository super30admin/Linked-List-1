"""
Given the head of a singly linked list, reverse the list, and return the reversed list.

"""

# Time Complexity : O(n)
# Space Complexity : O(n) for recursive, O(1) for iterative
# Did this code successfully run on leetcode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        # Recursive solution

        # Base case
        if head == None or head.next == None:
            return head

        # Recusrive function
        reversed = self.reverseList(head.next)
        # s.pop
        # head removed from stack

        # For every node, we are taking next.next element and pointing it to head (A B C --> C points to A)
        #                                                                                    B points to None
        # this way we are reversing the list while removing links to next nodes
        head.next.next = head
        # (A B C --> )
        head.next = None
        return reversed

        """
        # Iterative solution

        if head == None or head.next == None:
            return head

        # setting up 3 pointers 
        prev = None
        curr = head
        fast = head.next

        # Until end of the list, keep changing pointers to reverse list
        while (fast != None):
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next

        # In the end 1 last position is left to change
        curr.next = prev

        # curr will point to start of reversed list so return curr
        return curr

        """