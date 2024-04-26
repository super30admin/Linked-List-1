## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

#Approach
# keep a slow and fast pointer and initialize it to head pos. While fast != None and fast.next != None, increment fast pointer by 2 and slow pointer by 1
# if fast == slow, set fast back to head. While fast != slow, increment fast by 1 and slow by 1. Wherever they match next time is the start of pos of the cycle. return slow 
# if fast = None and fast.next = None, return None

# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow,fast = head,head
        while(fast != None and fast.next != None):
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                fast = head
                while(fast != slow):
                    fast = fast.next
                    slow = slow.next
                return slow
        return None