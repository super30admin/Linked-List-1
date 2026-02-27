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
        if not head:
            return None

        # Dummy poitner to help us when we are trying to remove
        # the head of LL.
        dummy = TreeNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy

        i = 0
        # Move the fast pointer N steps ahead.
        while i < (n+1):
            fast = fast.next
            i += 1

        # Until fast becomes null, we can iterate both slow and fast.
        # Eventually, when fast is null, slow will be at (n-1)th node.
        while fast != None:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next
        return dummy.next

    #Tc : O(n)
    #Sc : O(1)