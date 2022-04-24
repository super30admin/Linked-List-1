#TC : O(n)
#SC : O(1)
# Algorithm Used:  Floyed Tortoise and hare Algorithm
# successfully running on Leetcode
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """

        fast = head
        slow = head
        pointer = False
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                pointer = True
                break

        if not pointer:
            return None

        slow = head

        while fast != slow:
            fast = fast.next
            slow = slow.next

        return fast
