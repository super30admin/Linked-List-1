# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# We first detect the cycle by identifying the intersecting element using slow and fast pointer approach.
# Once we find that, we can create a start pointer and move start and slow pointer one step at a time.
# They should meet at the entry of the cycle.
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow, fast = head, head
        while slow != None and fast != None:
            if slow.next == None or fast.next == None or fast.next.next == None:
                return None
            slow, fast = slow.next, fast.next.next
            if slow == fast:
                break
            
        start = head
        while start != slow:
            start = start.next
            slow = slow.next
        return start

