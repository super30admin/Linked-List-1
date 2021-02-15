# Time Complexity :O(n) where n is number of nodes
# Space Complexity :O(1)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode :19

# Given the head of a linked list, remove the nth node from the end of the list and return its head.

# Input: head = [1,2,3,4,5], n = 2
# Output: [1,2,3,5]
#
# Input: head = [1], n = 1
# Output: []

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
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

        while (first is not None):
            first = first.next
            second = second.next

        second.next = second.next.next

        return dummy.next

head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)

#Just for printing purposes.
print(Solution().removeNthFromEnd(head,2).val)
