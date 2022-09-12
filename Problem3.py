## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution(object):
    def detectCycle(self, head):
        # Initialize pointers at head of linkedlist...
        p1 = p2 = head
        # Run a loop until p2 and p2.next is equal to null...
        while p2 and p2.next:
            # Moving p1 by 1 & p2 by 2
            p1, p2 = p1.next, p2.next.next
            # found the cycle...
            if p1 == p2: break
        # In case there is no cycle or no meeting point...
        else: return None
        # run loop until again head & p1 don't collab...
        while head != p1:
            # Moving head by 1 & p1 by 1 as well...
            head, p1 = head.next, p1.next
        return head  