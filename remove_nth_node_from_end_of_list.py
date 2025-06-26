# Time Complexity : O(n), where n is the length of the linked list
# Space Complexity : O(1), constant space used
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# I used the two-pointer technique to find the node to remove.
# First, I moved the first pointer n steps ahead.
# Then, I moved both first and second pointers together until first reaches the end.
# The second pointer will be just before the node to remove.
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head
        first = second = dummy

        # Move `first` ahead by n + 1 steps to reach the node after the target
        for _ in range(n + 1):
            first = first.next

        # Move both pointers until first reaches the end
        while first:
            first = first.next
            second = second.next

        # Remove the target node
        second.next = second.next.next

        return dummy.next
