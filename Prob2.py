#Time complexity: O(n), one pass
#Space complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

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
        if head.next == None:
            return None
        # dummy node created when first node needs to be deleted
        dummy = ListNode(None,head)
        head = dummy
        slowP = dummy
        fastP = dummy
        # move the fast pointer n steps so it is ahead
        for el in xrange(0,n):
            fastP = fastP.next
        
        #when the fast pointer reaches the end, the slow would be n+1 steps behind.
        while(fastP.next != None):
            slowP = slowP.next
            fastP = fastP.next
        # set the next pointer of the n+1 th node from the end to the n-1 th node from the end
        slowP.next=slowP.next.next
        # slowP.next.next = None
        return head.next