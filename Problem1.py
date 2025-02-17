# 206. Reverse Linked List

# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Intuition:
# Use a while loop to traverse the linked list and reverse the pointers.
# Use a temp variable to store the next node.
# Use a prev variable to store the previous node.
# Use a curr variable to store the current node.
# Use a next variable to store the next node.

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        curr = head
        while curr:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        return prev
    
# Recursive Solution:
# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        last = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return last