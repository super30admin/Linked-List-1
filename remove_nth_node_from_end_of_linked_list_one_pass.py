"""
Problem: 19. Remove Nth Node From End of List
Leetcode: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
Solution: One pass
Time Complexity: O(L), iterate the list of L nodes
Space Complexity: O(1), used constant extra space
"""


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode()
        dummy.next = head
        first = dummy
        second = dummy

        # Advance first pointer so that the gap between first and second pointer is n nodes apart
        # range 1 to n+2 i.e. head to n+1
        for i in range(1, n+ 2):
            first = first.next

        # move 1st to the end, maintaining the gap
        while first is not None:
            first = first.next
            second = second.next

        # remove the nth node
        second.next = second.next.next

        # since dummy is pointing to node before head
        return dummy.next
