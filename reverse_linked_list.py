# reverse_linked_list
# time complexity: O(N)
# space complexity: O(1)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None or head.next == None:
            return head
        reverse = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reverse