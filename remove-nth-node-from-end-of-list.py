# Time Complexity : O(n) - n is number of elements in the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
Take a dummy node and point to the head
Start slow and fast to dummy and move the fast pointer n steps, basically creating a gap of n between slow and fast node
Now when fast pointer reaches end of the list, slow would be at nth node from the end
"""

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

        dummy = ListNode(0)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0


        while count <= n:
            fast = fast.next
            count += 1

        while fast is not None:
            slow = slow.next
            fast = fast.next

        tmp = slow.next
        slow.next = tmp.next
        tmp.next = None

        return dummy.next