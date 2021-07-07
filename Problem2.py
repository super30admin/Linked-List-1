#
# Time Complexity = O(n)
# Space Complexity = O(1)
#
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        slow = TreeNode(-1)
        slow.next = head
        fast = head
        while n:
            fast = fast.next
            n -= 1
        if not fast:
            return head.next
        while fast:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return head
