# Time complexity: O(n)
# Space complexity: O(1)

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head):
        if not head:
            return head
        # check if there is a cycle or not
        isCycle, slow = self.hasCycle(head)
        if not isCycle:
            return None
        # Floyd's alg => distance from the head to the start of the cycle = dist from the meeting point to the start of the cycle +1 (when slow and fast pointers are started at head and head.next)
        ptr = head
        slow = slow.next
        while ptr != slow:
            ptr = ptr.next
            slow = slow.next
        return slow

    def hasCycle(self, head):
        slow, fast = head, head.next
        while slow != fast:
            if not fast or not fast.next:
                return (False, None)
            slow = slow.next
            fast = fast.next.next
        return (True, slow)
