## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

#Approach
# Create dummy node before head to handle the edge case of when we want to remove the first element of the Linked List. set slow and fast pointer at dummy
# while the difference between slow and fast pointer <= n, increment fast. While fast != None, increment slow and fast by 1. 
# set slow.next = slow.next.next and detach the original slow.next pointer from the LL using temp variable. set temp.next = None. Return dummy.next

# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        slow,fast = dummy,dummy

        count = 0
        while(count <=n):
            fast = fast.next
            count += 1

        while(fast != None):
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        return dummy.next