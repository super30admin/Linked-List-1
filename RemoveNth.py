'''
    Time Complexity:
        O(n)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Slow and Fast pointers.
        Start slow at head and fast at n steps away from head.
        Move both until fast is not null.
        Set slow.next as slow.next.next.
        Handle edge cases using a Dummy Node.
'''
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(None, head)

        slow = dummy
        fast = dummy

        while n >= 0:
            fast = fast.next
            n -= 1

        while fast:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next

        return dummy.next
