# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


# // Did this code successfully run on Leetcode : Yes - 2 approaches - recursive and iterative
# // Any problem you faced while coding this : No
class Solution(object):

    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # // Time Complexity : O(n)
        # // Space Complexity : O(1)

        def recursion(node):
            if not node or not node.next:
                return node
            new_head = recursion(node.next)
            node.next.next = node
            node.next = None
            return new_head

        # // Time Complexity : O(n)
        # // Space Complexity : O(n)

        def iterative(node):
            prev = None
            current = node

            while current:
                nex = current.next
                current.next = prev
                prev = current
                current = nex

            return prev

        return recursion(head)
