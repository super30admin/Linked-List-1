# Leetcode 19. Remove Nth Node From End of List

# Time Complexity :  O(n) where n is the number of the nodes in the list

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use two pointers, slow and fast. Fast pointer is moved at 1x until it is n steps ahead of
# slow. Then move both at 1x until fast goes out of the list. By now slow is before the nth element
# from the end.Remove the element by changing slow pointer's next to point the next node after the nth
# Use a dummy node at the start before head and start slow and fast from the dummy to include edge case
# where list has only one node.

# Your code here along with comments explaining your approach

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(0)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        # Giving fast pointer n steps ahead of slow pointer
        while count <= n:
            fast = fast.next
            count += 1
        # moving fast and slow at 1x until fast reaches end
        # so that slow before the nth element from the end
        while fast:
            slow = slow.next
            fast = fast.next
        # Slow is before the nth element, remove the element by changing
        # slow's next pointer to the element after the nth element
        slow.next = slow.next.next
        # returns the head node
        return dummy.next
