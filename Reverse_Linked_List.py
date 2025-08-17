#  Time Complexity : O(n)
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
#  Three line explanation of solution in plain english : This code recursively reverses a singly linked list. It keeps recursing until it reaches the last node, then starts rewiring each node’s next pointer so that the links are reversed (head.next.next = head).Finally, it sets the original head’s next to None (to avoid cycles) and returns the new head (result) of the reversed list.

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #Using Recursion
        #TC: O(n)    SC: O(n)
        if head is None or head.next is None:
            return head

        result = self.reverseList(head.next)
        head.next.next = head
        head.next = None

        return result