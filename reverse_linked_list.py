# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def reverseList(self, head):
        prev = None
        curr = head
        while curr:
            next_node = curr.next
            curr.next = prev
            prev = curr
            curr = next_node
        return prev

# Using Recursion
# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def reverseList(self, head):
        if not head or not head.next:
            return head
        new_head = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return new_head
