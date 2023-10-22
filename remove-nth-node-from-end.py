# BRUTE force approach : Traverse through the LL once, find the total length. Then minus n from it, say total length is 7 then 7-3 from the last = 4 node to remove. And then traverse through linked list again and remove 4th node.
# TC: O(2n) to traverse twice. SC: O(1)

# Using slow and fast ptrs # TC: O(n), SC: O(1)

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """

        count = 0

        # use a dummy node if you have to remove the first node
        dummy = ListNode(-1)
        dummy.next = head
        slow = fast = dummy

        # move fast ptr until there is gap of n between slow and fast
        while count <= n:

            fast = fast.next
            count += 1

        # Once you find the gap, move slow and fast until fast reaches null. Again this will mean there is a gap of n between the both. Logically to remove to a node we need slow to be just one node behind the node to remove.
        while fast != None:
            slow = slow.next
            fast = fast.next

        temp = slow.next
        slow.next = temp.next
        temp.next = None

        return dummy.next  # since head is at dummy.next
