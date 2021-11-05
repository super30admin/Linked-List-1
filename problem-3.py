#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = fast = head
        if not head or not head.next:
            return None
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                break
        if fast == slow:
            slow = head
            while slow != fast:
                slow = slow.next
                fast = fast.next
            return slow
        else:
            return None
