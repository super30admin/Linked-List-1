# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# Time Complexity : O(n)
# Space Complexity: O(1)
class Solution(object):

    # def baseApproach(self, head):

    def optimizedApproach(self, head):
        #     Base condition
        if head is None:
            return None
        #         Initiliazing the slow and fast pointer with sp as 1x and fp as 2x
        sp = head
        fp = head
        isCycleNode = None
        #         we will interate over list untik we meet at one point
        # If we found intersection then we break out of the loop
        while fp is not None and fp.next is not None:
            sp = sp.next
            fp = fp.next.next
            if sp == fp:
                isCycleNode = sp
                break
        #         If there is no intersection then list has no cycle
        if isCycleNode is None:
            return None
        #         else we will again iterate over list with sp and fp with pace 1x and when both intersect then that will be the 1st index of intersection
        sp = head
        fp = isCycleNode

        while sp != fp:
            sp = sp.next
            fp = fp.next

        return sp

    def detectCycle(self, head):

        return self.optimizedApproach(head)
        """
        :type head: ListNode
        :rtype: ListNode
        """
