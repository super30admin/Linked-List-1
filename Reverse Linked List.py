// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        prev = None
        curr = head
        node = head.next
        while node:
            node = curr.next
            curr.next = prev
            prev = curr
            curr = node
            node = node.next
        curr.next = prev
        return curr