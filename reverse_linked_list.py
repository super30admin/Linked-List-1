# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# I used an iterative approach to reverse the linked list.
# Starting from the head, I reversed each node’s pointer one by one.
# I maintained a prev pointer to build the reversed list as I traversed.
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head

        while curr:
            next_temp = curr.next  # Save next node
            curr.next = prev       # Reverse current node's link
            prev = curr            # Move prev to current
            curr = next_temp       # Move to next node

        return prev
