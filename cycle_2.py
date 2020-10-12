class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        slow=fast=head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast==slow:
                start = head
                while(start!=slow):
                    slow = slow.next
                    start = start.next
                return slow
        