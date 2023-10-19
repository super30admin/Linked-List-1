# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # Time Complexity: O(N)
        # Space Complexity: O(N)
        nodes = set()
        while head:
            if head not in nodes:
                nodes.add(head)
            else:
                return head
            head = head.next
        return None
