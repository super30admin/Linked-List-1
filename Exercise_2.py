# S30 Problem #50 Remove Nth Node From End of List
#LeetCode #19 https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

# Author : Akaash Trivedi
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :  Yes #
# Any problem you faced while coding this : No

# use sliding window between slow and fast pointer by creating gap of n nodes
# point slow to next.next to delete the link

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # create dummy node at start
        prev = ListNode(0)
        prev.next = head
        slow = prev
        fast = prev
        count = 0
        # create gap between slow and fast of n nodes
        while count <= n:
            fast = fast.next
            count +=1
        # move fast to the end maintaining the gap
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return prev.next