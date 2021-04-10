# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(head):
        if not head:
            return None

        slow = fast = head
        node = None
        '''
        A fast pointer will either loop around a cycle and meet the slow
        pointer or reach the `null` at the end of a non-cyclic list.
        '''
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                node = slow
                break

        '''
        If there is a cycle, the fast/slow pointers will intersect at some
        node. Otherwise, there is no cycle, so we cannot find an entrance to
        a cycle.
        '''

        if node is None:
            return None

        ptr1 = head
        ptr2 = node


        '''
        To find the entrance to the cycle, we have two pointers traverse at
        the same speed -- one from the front of the list, and the other from
        the point of intersection.
        '''

        while ptr1 != ptr2:
            ptr1 = ptr1.next
            ptr2 = ptr2.next

        return ptr1

'''
Complexity Analysis
Time complexity : O(N) N elements in list
Space complexity : O(1)
'''