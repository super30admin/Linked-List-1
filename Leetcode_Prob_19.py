# Problem: Remove Nth Node From End of List
# Time Complexity: O(n)
# Space Complexity: O(1)
# Approach: We will use two pointers left and right and we will move the right pointer n times. 
# Then we will move both the pointers till the right pointer reaches the end of the linked list.
# Then we will delete the node pointed by the left pointer.
# Basically we are maintaining a gap of n nodes between the left and right pointer.
# We will use a dummy node to handle the edge case when the node to be deleted is the head node.


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        left = dummy
        right = head

        while n > 0:
            right = right.next
            n -= 1

        while right:
            left = left.next
            right = right.next

        # delete
        left.next = left.next.next
        return dummy.next