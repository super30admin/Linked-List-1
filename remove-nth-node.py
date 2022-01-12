# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

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

        count = 0  # to maintain a count in the list

        # setting fast and slow pointers
        fast = head
        slow = head

        # keep incrementing the count till the while turns false
        while count < n:

            fast = fast.next  # increment fast pointer by 1 position
            count = count + 1

        if fast == None:
            return head.next

        while fast.next:
            slow = slow.next
            fast = fast.next

        # slow pointer will be pointing to the node ahead of the node to be deleted
        slow.next = slow.next.next

        return head
