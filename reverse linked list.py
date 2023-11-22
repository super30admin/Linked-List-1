# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : NO


# // Your code here along with comments explaining your approach
class Solution:
    def invertAndGetHead(self, head):
        prev = None
        curr = head
        next = head.next
        while curr:
            next = curr.next
            curr.next = prev

            prev = curr
            curr = next
        newHead = prev
        return newHead
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        return self.invertAndGetHead(head)

        