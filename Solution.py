class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        time: O(n)
        space: O(1)
        """
        prev = None
        while head:
            tmp = head.next
            head.next = prev
            prev = head
            head = tmp
        return prev

    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        0 -> 1
        fast = 1
        slow = 0
        time: O(n)
        space: O(1)
        """
        dummy = TreeNode()
        dummy.next = head
        slow = fast = dummy
        slow.next = head
        fast.next = head
        
        i = 0
        while i <= n:
            fast = fast.next
            i += 1
        while fast:
            slow = slow.next
            fast = fast.next
        tmp = slow.next.next
        slow.next.next = None
        slow.next = tmp
        return dummy.next

        def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        time: O(n)
        space: O(1)
        """
        slow = fast = head
        is_cycle = False
        while fast and fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                is_cycle = True
                break
        if not is_cycle:
            return
        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow