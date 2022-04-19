# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


# // Time Complexity : O(n) => n nodes in list
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes - 2 approaches (with dummy node and without dummy node)
# // Any problem you faced while coding this : No

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """

        def dummyNodeApproach():
            cursor = n
            dummy = ListNode(0)
            dummy.next = head
            fp = dummy
            sp = dummy

            while cursor >= 0:
                fp = fp.next
                cursor = cursor - 1

            while fp:
                sp = sp.next
                fp = fp.next

            sp.next = sp.next.next

            return dummy.next

        def withoutDummyNode():
            cursor = n
            fp = head
            sp = head

            while cursor > 0:
                fp = fp.next
                cursor = cursor - 1
            if not fp:
                return head.next
            while fp.next:
                sp = sp.next
                fp = fp.next

            sp.next = sp.next.next

            return head

        return dummyNodeApproach()
