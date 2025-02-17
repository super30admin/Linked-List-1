# 19. Remove Nth Node From End of List

# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Intuition:
# Use two pointers to find the nth node from the end of the list.
# Use a dummy node to handle the edge case where the first node is removed.
# Use a while loop to traverse the list and find the nth node from the end.
# Use a temp variable to store the next node.
# Use a prev variable to store the previous node.
# Use a curr variable to store the current node.

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(0)
        dummy.next = head
        first = dummy
        second = dummy
        for i in range(1, n + 1):
            first = first.next
        while first.next:
            first = first.next
            second = second.next
        second.next = second.next.next
        return dummy.next
    
    
    