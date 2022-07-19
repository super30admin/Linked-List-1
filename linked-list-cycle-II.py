"""
Runtime Complexity:
O(n) -  because we traverse all the nodes using slow and fast pointers.
Space Complexity:
O(1) - no extra space required to compute the solution.
Yes, the code worked on leetcode.
The idea behind the algorithm is to start both slow and fast pointers from the head and increase slow by one and fast by two. Both the pointers meet at one point which means we have a cycle.
If cycle is detected we reset slow to head again, then we increment both slow and fast pointer by only one and they both meet at the point which is our expected output.
"""


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        hasCycle = False
        slow = head
        fast = head
        while fast!=None and fast.next!=None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                hasCycle = True
                break
        if not hasCycle:
            return None
        slow = head
        while fast!=slow:
            slow = slow.next
            fast = fast.next
        return slow
                
        