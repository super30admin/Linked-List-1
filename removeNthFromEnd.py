# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        length = 0
        curr = head
        while curr is not None:
            length += 1
            curr = curr.next

        target = length - n + 1

        # If target is 1, remove the head node
        if target == 1:
            return head.next

        # Traverse to the node just before the target node
        curr = head
        for _ in range(target - 2):
            curr = curr.next

        # Remove the target node
        curr.next = curr.next.next

        return head
