# Time complexity : O(N)
# Space complexity : O(1)
class Solution:
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy = ListNode(0)
        dummy.next = head
        first = dummy
        second = dummy

        for i in range(n + 1):
            first = first.next

        while first is not None:
            first = first.next
            second = second.next
        second.next = second.next.next
        return dummy.next