# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None


# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this :

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None:
            return None

        sp = head
        fp = head
        hasCycle = False
        # check if cycle exists.
        while(fp and fp.next):
            sp = sp.next
            fp = fp.next.next
            if sp == fp:
                hasCycle = True
                break

        if hasCycle:
            sp = head
            while(sp != fp):
                sp = sp.next
                fp = fp.next

            return fp

        return None
