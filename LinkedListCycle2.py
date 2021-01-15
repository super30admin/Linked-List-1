# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Using Two pointer approach. Initialize fast and slow pointers to head.
# Update the fast by 2 and slow by 1 until fast == slow
# If fast == slow break and initialize slow to head and fast remains at the same position in the cycle
# If fast != slow anytime then there is no cycle in the linkedlist and fast and fast.next will be None
# Move the pointers by 1 until they meet. The position at which they meet is the start of the cycle


class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return None
        fast = head
        slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                break
        if not fast or not fast.next:
            return None
        pointer1 = slow
        pointer2 = head

        while pointer1 != pointer2:
            pointer1 = pointer1.next
            pointer2 = pointer2.next
        return pointer1