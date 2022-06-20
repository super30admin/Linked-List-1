# Time Complexity : O(n)
# Space Complexity : O(1);
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head):
        if not head:
            return None
        slow = head
        fast = head
        flag = False
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        if flag is False:
            return None
        slow = head
        while True:
            slow = slow.next
            fast = fast.next
            if slow == fast:
                break
        return fast.val


check = ListNode(3)
check.next = ListNode(2)
check.next.next = ListNode(0)
check.next.next.next = ListNode(-4)
check.next.next.next.next = check.next
print(Solution().detectCycle(check))
