# Time Complexity : O(N) where N is the number of nodes in the linked list
# Space Complexity : O(1) as we only use a constant amount of extra space for pointers
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach:
# I am using a two-pointer technique to remove the nth node from the end of the linked list.
# I create a dummy node that points to the head of the list to handle edge cases.
# I initialize two pointers, fast and slow, both starting at the dummy node.
# I move the fast pointer n+1 steps ahead to create a gap of n nodes between fast and slow.
# Then, I move both pointers one step at a time until fast reaches the end of the list.
# At this point, slow will be pointing to the node just before the nth node from the end.
# I adjust the next pointer of the slow node to skip the nth node, effectively removing it from the list.
# Finally, I return the next node of the dummy node, which is the new head of the modified list.

from typing import Optional
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        curr = ListNode(0)
        curr.next = head
        fast = curr
        slow = curr
        for _ in range(n + 1):
            fast = fast.next
        while fast:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return curr.next
            

       
        



        