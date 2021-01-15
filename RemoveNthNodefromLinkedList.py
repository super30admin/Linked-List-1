# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# One Pass Approach using Two Pointers. Initialize a dummy node to 0 and dummy.next to head
# Initialize fast and slow pointers to dummy node. Update the fast pointer by one until it reaches one node before the nth node to remove from the linkedlist
# Then update the fast pointer and slow pointer by one until fast or fast.next is null.


class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head:
            return None
        dummy = ListNode(0)
        dummy.next = head
        fast = dummy
        slow = dummy
        count = 0
        while count <= n:
            fast = fast.next
            count += 1

        while fast:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next

        return dummy.next