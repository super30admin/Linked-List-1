class Solution(object):
    def getIntersect(self, head):
        tortoise = head
        hare = head


        while hare is not None and hare.next is not None:
            tortoise = tortoise.next
            hare = hare.next.next
            if tortoise == hare:
                return tortoise

        return None

    def detectCycle(self, head):
        if head is None:
            return None


        intersect = self.getIntersect(head)
        if intersect is None:
            return None

        ptr1 = head
        ptr2 = intersect
        while ptr1 != ptr2:
            ptr1 = ptr1.next
            ptr2 = ptr2.next

        return ptr1

"""

TC = O(n)
SC = O(1)

"""

"""
 1) A fast pointer will either loop around a cycle and meet the slow,pointer or reach the `null` at the end of a non-cyclic list.
 2) If there is a cycle, the fast/slow pointers will intersect at some node. Otherwise, there is no cycle, so we cannot find an entrance to
 a cycle.
 3)To find the entrance to the cycle, we have two pointers traverse at the same speed -- one from the front of the list, and the other from the point of intersection.

 """
