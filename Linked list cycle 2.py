// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        flag = False
        fast = head
        slow = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slo w= =fast:
                flag = True
                break

        if fla g= =False:
            return None
        slow = head
        while fas t! =slow:
            slow = slow.next
            fast = fast.next
        return fast