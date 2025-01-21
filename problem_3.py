#  Problem: https://leetcode.com/problems/linked-list-cycle-ii/description/
#  Time Complexity: O(n)
#  Space Complexity: O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersect(self, head):
        tortoise = head
        hare = head

        # A fast pointer will either loop around a cycle and meet the slow
        # pointer or reach the `null` at the end of a non-cyclic list.
        while hare is not None and hare.next is not None:
            tortoise = tortoise.next
            hare = hare.next.next
            if tortoise == hare:
                return tortoise

        return None
    # def getIntersect(self, head):
    #     # if head is None:
    #     #     return None
    #     slow = head
    #     fast = head.next 
    #     while fast and fast.next:
    #         if slow == fast:
    #             return (slow)
    #         slow = slow.next
    #         fast = fast.next.next
    #     return None
    
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
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